package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DownloadSimple: ImageVector
    get() {
        if (_downloadSimple != null) return _downloadSimple!!
        _downloadSimple = phosphorLightIcon(
            name = "DownloadSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 222.000 144.000 L 222.000 208.000 C 222.000 211.314 219.314 214.000 216.000 214.000 L 40.000 214.000 C 36.686 214.000 34.000 211.314 34.000 208.000 L 34.000 144.000 C 34.000 140.686 36.686 138.000 40.000 138.000 C 43.314 138.000 46.000 140.686 46.000 144.000 L 46.000 202.000 L 210.000 202.000 L 210.000 144.000 C 210.000 140.686 212.686 138.000 216.000 138.000 C 219.314 138.000 222.000 140.686 222.000 144.000 ZM 123.760 148.240 C 126.103 150.580 129.897 150.580 132.240 148.240 L 172.240 108.240 C 174.443 105.876 174.378 102.192 172.093 99.907 C 169.808 97.622 166.124 97.557 163.760 99.760 L 134.000 129.510 L 134.000 32.000 C 134.000 28.686 131.314 26.000 128.000 26.000 C 124.686 26.000 122.000 28.686 122.000 32.000 L 122.000 129.510 L 92.240 99.760 C 89.876 97.557 86.192 97.622 83.907 99.907 C 81.622 102.192 81.557 105.876 83.760 108.240 Z"),
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
        return _downloadSimple!!
    }

private var _downloadSimple: ImageVector? = null
