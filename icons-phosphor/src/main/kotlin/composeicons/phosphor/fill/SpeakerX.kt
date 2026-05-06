package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SpeakerX: ImageVector
    get() {
        if (_speakerX != null) return _speakerX!!
        _speakerX = phosphorFillIcon(
            name = "SpeakerX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M245.66 146.34c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0L216 139.31l-18.34 18.35c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L204.69 128 186.34 109.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L216 116.69 234.34 98.34c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L227.31 128ZM60 80h-28C23.163 80 16 87.163 16 96v64c0 8.837 7.163 16 16 16h28c2.209 0 4-1.791 4-4v-88c0-2.209-1.791-4-4-4ZM157.15 25.85c-2.885-2.387-7.04-2.454-10-.16L81.58 76.69c-.986 .749-1.569 1.912-1.58 3.15v96.32c.004 1.233 .576 2.395 1.55 3.15l65.57 51c2.599 2.021 6.171 2.243 9 .56 2.475-1.54 3.96-4.266 3.91-7.18v-191.44c.03-2.46-1.036-4.806-2.91-6.4Z"),
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
        return _speakerX!!
    }

private var _speakerX: ImageVector? = null
