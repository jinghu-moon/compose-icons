package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BracketsAngle: ImageVector
    get() {
        if (_bracketsAngle != null) return _bracketsAngle!!
        _bracketsAngle = phosphorFillIcon(
            name = "BracketsAngle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(103.0f, 180.0f),
                    PathNode.CurveTo(105.20914f, 183.85219f, 103.87719f, 188.76585f, 100.025f, 190.975f),
                    PathNode.CurveTo(96.17281f, 193.18414f, 91.25915f, 191.85219f, 89.05f, 188.0f),
                    PathNode.LineTo(57.05f, 132.0f),
                    PathNode.CurveTo(55.643917f, 129.54008f, 55.643917f, 126.51991f, 57.05f, 124.06f),
                    PathNode.LineTo(89.05f, 68.06f),
                    PathNode.CurveTo(91.24257f, 64.20782f, 96.142815f, 62.86243f, 99.995f, 65.055f),
                    PathNode.CurveTo(103.84718f, 67.247574f, 105.19257f, 72.147804f, 103.0f, 76.0f),
                    PathNode.LineTo(73.21f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(199.0f, 132.0f),
                    PathNode.LineTo(167.0f, 188.0f),
                    PathNode.CurveTo(164.80743f, 191.83838f, 159.91838f, 193.17258f, 156.08f, 190.98f),
                    PathNode.CurveTo(152.24162f, 188.78743f, 150.90742f, 183.89838f, 153.1f, 180.06f),
                    PathNode.LineTo(182.84f, 128.06f),
                    PathNode.LineTo(153.05f, 76.0f),
                    PathNode.CurveTo(150.84087f, 72.147804f, 152.17282f, 67.23414f, 156.025f, 65.025f),
                    PathNode.CurveTo(159.87718f, 62.81586f, 164.79086f, 64.14781f, 167.0f, 68.0f),
                    PathNode.LineTo(199.0f, 124.0f),
                    PathNode.CurveTo(200.42906f, 126.47522f, 200.42906f, 129.5248f, 199.0f, 132.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _bracketsAngle!!
    }

private var _bracketsAngle: ImageVector? = null
