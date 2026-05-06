package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AndroidLogo: ImageVector
    get() {
        if (_androidLogo != null) return _androidLogo!!
        _androidLogo = phosphorLightIcon(
            name = "AndroidLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M174 148c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM92 138c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10ZM238 160v24c0 7.732-6.268 14-14 14h-192c-7.732 0-14-6.268-14-14v-22.87C17.974 129.794 31.144 99.895 54.28 78.76L27.76 52.24C26.155 50.744 25.494 48.492 26.037 46.366c.543-2.126 2.203-3.786 4.329-4.329 2.126-.543 4.379 .118 5.874 1.723L63.61 71.12C82.163 57.471 104.577 50.074 127.61 50h.39c23.204-.064 45.825 7.267 64.58 20.93L219.76 43.76c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333L201.93 78.55c1.26 1.15 2.5 2.32 3.72 3.53C226.428 102.676 238.081 130.744 238 160ZM226 160C226 105.876 182.124 62 128 62h-.35C73.81 62.19 30 106.66 30 161.13v22.87c0 1.105 .895 2 2 2h192c1.105 0 2-.895 2-2Z"),
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
        return _androidLogo!!
    }

private var _androidLogo: ImageVector? = null
