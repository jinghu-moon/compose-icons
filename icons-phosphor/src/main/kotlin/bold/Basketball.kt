package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Basketball: ImageVector
    get() {
        if (_basketball != null) return _basketball!!
        _basketball = phosphorBoldIcon(
            name = "Basketball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 60.000 177.280 C 51.997 166.270 46.803 153.473 44.870 140.000 L 75.140 140.000 C 73.223 153.479 68.024 166.281 60.000 177.280 ZM 44.870 116.000 C 46.803 102.527 51.997 89.730 60.000 78.720 C 68.024 89.719 73.223 102.521 75.140 116.000 ZM 116.000 211.130 C 101.804 209.079 88.373 203.410 77.000 194.670 C 89.431 178.905 97.173 159.959 99.340 140.000 L 116.000 140.000 ZM 116.000 116.000 L 99.340 116.000 C 97.173 96.041 89.431 77.095 77.000 61.330 C 88.373 52.590 101.804 46.921 116.000 44.870 ZM 196.000 78.720 C 204.003 89.730 209.197 102.527 211.130 116.000 L 180.860 116.000 C 182.777 102.521 187.976 89.719 196.000 78.720 ZM 140.000 211.130 L 140.000 140.000 L 156.660 140.000 C 158.827 159.959 166.569 178.905 179.000 194.670 C 167.627 203.410 154.196 209.079 140.000 211.130 ZM 156.660 116.000 L 140.000 116.000 L 140.000 44.870 C 154.196 46.921 167.627 52.590 179.000 61.330 C 166.569 77.095 158.827 96.041 156.660 116.000 ZM 196.000 177.280 C 187.976 166.281 182.777 153.479 180.860 140.000 L 211.130 140.000 C 209.197 153.473 204.003 166.270 196.000 177.280 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _basketball!!
    }

private var _basketball: ImageVector? = null
