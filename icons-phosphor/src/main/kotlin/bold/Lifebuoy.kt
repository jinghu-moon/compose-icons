package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Lifebuoy: ImageVector
    get() {
        if (_lifebuoy != null) return _lifebuoy!!
        _lifebuoy = phosphorBoldIcon(
            name = "Lifebuoy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 172.250 155.280 C 182.583 138.561 182.583 117.439 172.250 100.720 L 195.250 77.720 C 217.583 107.520 217.583 148.480 195.250 178.280 ZM 100.000 128.000 C 100.000 112.536 112.536 100.000 128.000 100.000 C 143.464 100.000 156.000 112.536 156.000 128.000 C 156.000 143.464 143.464 156.000 128.000 156.000 C 112.536 156.000 100.000 143.464 100.000 128.000 ZM 178.280 60.750 L 155.280 83.750 C 138.561 73.417 117.439 73.417 100.720 83.750 L 77.720 60.750 C 107.520 38.417 148.480 38.417 178.280 60.750 ZM 60.750 77.750 L 83.750 100.750 C 73.417 117.469 73.417 138.591 83.750 155.310 L 60.750 178.310 C 38.417 148.510 38.417 107.550 60.750 77.750 ZM 77.750 195.280 L 100.750 172.280 C 117.469 182.613 138.591 182.613 155.310 172.280 L 178.310 195.280 C 148.510 217.613 107.550 217.613 77.750 195.280 Z"),
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
        return _lifebuoy!!
    }

private var _lifebuoy: ImageVector? = null
