package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FigmaLogo: ImageVector
    get() {
        if (_figmaLogo != null) return _figmaLogo!!
        _figmaLogo = phosphorBoldIcon(
            name = "FigmaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M198.15 96C211.255 83.632 215.495 64.524 208.85 47.775 202.205 31.025 186.019 20.02 168 20h-72C77.981 20.02 61.795 31.025 55.15 47.775 48.505 64.524 52.745 83.632 65.85 96c-9.048 8.495-14.077 20.424-13.843 32.833 .234 12.409 5.711 24.139 15.073 32.287-15.944 15.025-19.691 38.939-9.107 58.121 10.584 19.182 32.813 28.763 54.025 23.287C133.211 237.052 148.024 217.908 148 196v-28.83c19.483 9.845 43.238 3.917 55.811-13.927C216.385 135.4 213.975 111.035 198.15 96ZM188 64c0 11.046-8.954 20-20 20h-20v-40h20c11.046 0 20 8.954 20 20ZM76 64C76 52.954 84.954 44 96 44h28v40h-28C84.954 84 76 75.046 76 64ZM96 148C84.954 148 76 139.046 76 128c0-11.046 8.954-20 20-20h28v40h-28ZM124 196c0 13.255-10.745 24-24 24C86.745 220 76 209.255 76 196c0-13.255 10.745-24 24-24h24ZM168 148c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20Z"),
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
        return _figmaLogo!!
    }

private var _figmaLogo: ImageVector? = null
