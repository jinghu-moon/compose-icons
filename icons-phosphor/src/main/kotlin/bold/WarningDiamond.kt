package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WarningDiamond: ImageVector
    get() {
        if (_warningDiamond != null) return _warningDiamond!!
        _warningDiamond = phosphorBoldIcon(
            name = "WarningDiamond",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 68.000 C 134.627 68.000 140.000 73.373 140.000 80.000 L 140.000 132.000 C 140.000 138.627 134.627 144.000 128.000 144.000 C 121.373 144.000 116.000 138.627 116.000 132.000 L 116.000 80.000 C 116.000 73.373 121.373 68.000 128.000 68.000 ZM 128.000 156.000 C 119.163 156.000 112.000 163.163 112.000 172.000 C 112.000 180.837 119.163 188.000 128.000 188.000 C 136.837 188.000 144.000 180.837 144.000 172.000 C 144.000 163.163 136.837 156.000 128.000 156.000 ZM 244.000 128.000 C 244.012 133.294 241.909 138.373 238.160 142.110 L 142.160 238.170 C 134.358 245.931 121.752 245.931 113.950 238.170 L 113.950 238.170 L 17.950 142.110 C 10.182 134.307 10.182 121.693 17.950 113.890 L 114.000 17.830 C 121.802 10.069 134.408 10.069 142.210 17.830 L 238.270 113.890 C 241.979 117.645 244.041 122.722 244.000 128.000 ZM 218.320 128.000 L 128.000 37.670 L 37.680 128.000 L 128.000 218.330 Z"),
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
        return _warningDiamond!!
    }

private var _warningDiamond: ImageVector? = null
