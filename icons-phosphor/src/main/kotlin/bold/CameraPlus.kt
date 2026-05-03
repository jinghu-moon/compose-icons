package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CameraPlus: ImageVector
    get() {
        if (_cameraPlus != null) return _cameraPlus!!
        _cameraPlus = phosphorBoldIcon(
            name = "CameraPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 172.000 136.000 C 172.000 142.627 166.627 148.000 160.000 148.000 L 140.000 148.000 L 140.000 168.000 C 140.000 174.627 134.627 180.000 128.000 180.000 C 121.373 180.000 116.000 174.627 116.000 168.000 L 116.000 148.000 L 96.000 148.000 C 89.373 148.000 84.000 142.627 84.000 136.000 C 84.000 129.373 89.373 124.000 96.000 124.000 L 116.000 124.000 L 116.000 104.000 C 116.000 97.373 121.373 92.000 128.000 92.000 C 134.627 92.000 140.000 97.373 140.000 104.000 L 140.000 124.000 L 160.000 124.000 C 166.627 124.000 172.000 129.373 172.000 136.000 ZM 236.000 80.000 L 236.000 192.000 C 236.000 207.464 223.464 220.000 208.000 220.000 L 48.000 220.000 C 32.536 220.000 20.000 207.464 20.000 192.000 L 20.000 80.000 C 20.000 64.536 32.536 52.000 48.000 52.000 L 73.580 52.000 L 83.640 36.910 C 87.348 31.345 93.593 28.001 100.280 28.000 L 155.720 28.000 C 162.407 28.001 168.652 31.345 172.360 36.910 L 182.420 52.000 L 208.000 52.000 C 223.464 52.000 236.000 64.536 236.000 80.000 ZM 212.000 80.000 C 212.000 77.791 210.209 76.000 208.000 76.000 L 176.000 76.000 C 171.983 76.006 168.229 74.002 166.000 70.660 L 153.580 52.000 L 102.420 52.000 L 90.000 70.660 C 87.771 74.002 84.017 76.006 80.000 76.000 L 48.000 76.000 C 45.791 76.000 44.000 77.791 44.000 80.000 L 44.000 192.000 C 44.000 194.209 45.791 196.000 48.000 196.000 L 208.000 196.000 C 210.209 196.000 212.000 194.209 212.000 192.000 Z"),
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
        return _cameraPlus!!
    }

private var _cameraPlus: ImageVector? = null
