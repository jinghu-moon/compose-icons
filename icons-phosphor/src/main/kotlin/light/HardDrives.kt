package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HardDrives: ImageVector
    get() {
        if (_hardDrives != null) return _hardDrives!!
        _hardDrives = phosphorLightIcon(
            name = "HardDrives",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 138.000 L 48.000 138.000 C 40.268 138.000 34.000 144.268 34.000 152.000 L 34.000 200.000 C 34.000 207.732 40.268 214.000 48.000 214.000 L 208.000 214.000 C 215.732 214.000 222.000 207.732 222.000 200.000 L 222.000 152.000 C 222.000 144.268 215.732 138.000 208.000 138.000 ZM 210.000 200.000 C 210.000 201.105 209.105 202.000 208.000 202.000 L 48.000 202.000 C 46.895 202.000 46.000 201.105 46.000 200.000 L 46.000 152.000 C 46.000 150.895 46.895 150.000 48.000 150.000 L 208.000 150.000 C 209.105 150.000 210.000 150.895 210.000 152.000 ZM 208.000 42.000 L 48.000 42.000 C 40.268 42.000 34.000 48.268 34.000 56.000 L 34.000 104.000 C 34.000 111.732 40.268 118.000 48.000 118.000 L 208.000 118.000 C 215.732 118.000 222.000 111.732 222.000 104.000 L 222.000 56.000 C 222.000 48.268 215.732 42.000 208.000 42.000 ZM 210.000 104.000 C 210.000 105.105 209.105 106.000 208.000 106.000 L 48.000 106.000 C 46.895 106.000 46.000 105.105 46.000 104.000 L 46.000 56.000 C 46.000 54.895 46.895 54.000 48.000 54.000 L 208.000 54.000 C 209.105 54.000 210.000 54.895 210.000 56.000 ZM 190.000 80.000 C 190.000 85.523 185.523 90.000 180.000 90.000 C 174.477 90.000 170.000 85.523 170.000 80.000 C 170.000 74.477 174.477 70.000 180.000 70.000 C 185.523 70.000 190.000 74.477 190.000 80.000 ZM 190.000 176.000 C 190.000 181.523 185.523 186.000 180.000 186.000 C 174.477 186.000 170.000 181.523 170.000 176.000 C 170.000 170.477 174.477 166.000 180.000 166.000 C 185.523 166.000 190.000 170.477 190.000 176.000 Z"),
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
        return _hardDrives!!
    }

private var _hardDrives: ImageVector? = null
