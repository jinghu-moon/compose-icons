package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserGear: ImageVector
    get() {
        if (_userGear != null) return _userGear!!
        _userGear = phosphorBoldIcon(
            name = "UserGear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M148.5 156.53c24.126-18.968 33.577-51.144 23.542-80.146C162.006 47.382 134.69 27.928 104 27.928c-30.69 0-58.006 19.453-68.042 48.456-10.036 29.002-.585 61.178 23.542 80.146-18.929 7.721-35.655 20.002-48.69 35.75-4.264 5.076-3.605 12.646 1.47 16.91 5.075 4.264 12.646 3.605 16.91-1.47C48.54 184.69 75.11 172 104 172c37 0 61.12 19.42 74.81 35.72 4.264 5.076 11.835 5.734 16.91 1.47 5.076-4.264 5.734-11.835 1.47-16.91C184.155 176.532 167.429 164.251 148.5 156.53ZM56 100C56 73.49 77.49 52 104 52c26.51 0 48 21.49 48 48 0 26.51-21.49 48-48 48C77.502 147.972 56.028 126.498 56 100ZM246.53 140l-7.11 2.31 4.39 6.05c2.607 3.463 3.143 8.063 1.403 12.034-1.74 3.97-5.486 6.693-9.8 7.124-4.313 .43-8.524-1.499-11.014-5.047L220 156.41l-4.4 6.06c-2.49 3.548-6.7 5.478-11.014 5.047-4.313-.43-8.059-3.153-9.8-7.124-1.74-3.97-1.204-8.57 1.403-12.034l4.39-6.05L193.47 140c-6.304-2.046-9.756-8.816-7.71-15.12 2.046-6.304 8.816-9.756 15.12-7.71l7.12 2.31v-7.48c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v7.48l7.12-2.31c6.304-2.046 13.074 1.406 15.12 7.71 2.046 6.304-1.406 13.074-7.71 15.12Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _userGear!!
    }

private var _userGear: ImageVector? = null
