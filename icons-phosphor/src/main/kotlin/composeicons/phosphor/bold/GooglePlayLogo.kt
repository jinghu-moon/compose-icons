package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GooglePlayLogo: ImageVector
    get() {
        if (_googlePlayLogo != null) return _googlePlayLogo!!
        _googlePlayLogo = phosphorBoldIcon(
            name = "GooglePlayLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M241.79 110.7 74 14.65C67.758 11.099 60.101 11.122 53.88 14.71 47.74 18.221 43.965 24.766 44 31.84v192.32c-.029 7.08 3.758 13.626 9.91 17.13 6.22 3.592 13.879 3.615 20.12 .06l167.76-96c6.3-3.477 10.212-10.104 10.212-17.3 0-7.196-3.912-13.823-10.212-17.3ZM68 203v-150l75 75ZM160 145l12.4 12.4-58 33.2ZM114.41 65.43l58 33.2L160 111ZM194 145 177 128l17-17 29.72 17Z"),
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
        return _googlePlayLogo!!
    }

private var _googlePlayLogo: ImageVector? = null
