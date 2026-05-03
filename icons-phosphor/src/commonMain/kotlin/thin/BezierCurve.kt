package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BezierCurve: ImageVector
    get() {
        if (_bezierCurve != null) return _bezierCurve!!
        _bezierCurve = phosphorThinIcon(
            name = "BezierCurve",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(217.83f, 148.07f),
                    PathNode.CurveTo(211.43228f, 119.68192f, 192.06207f, 95.95251f, 165.53f, 84.0f),
                    PathNode.LineTo(240.0f, 84.0f),
                    PathNode.CurveTo(242.20914f, 84.0f, 244.0f, 82.20914f, 244.0f, 80.0f),
                    PathNode.CurveTo(244.0f, 77.79086f, 242.20914f, 76.0f, 240.0f, 76.0f),
                    PathNode.LineTo(155.71f, 76.0f),
                    PathNode.CurveTo(153.71301f, 62.232746f, 141.91133f, 52.01944f, 128.0f, 52.01944f),
                    PathNode.CurveTo(114.08867f, 52.01944f, 102.286995f, 62.232746f, 100.29f, 76.0f),
                    PathNode.LineTo(16.0f, 76.0f),
                    PathNode.CurveTo(13.790861f, 76.0f, 12.0f, 77.79086f, 12.0f, 80.0f),
                    PathNode.CurveTo(12.0f, 82.20914f, 13.790861f, 84.0f, 16.0f, 84.0f),
                    PathNode.LineTo(90.47f, 84.0f),
                    PathNode.CurveTo(63.937923f, 95.95251f, 44.567726f, 119.68192f, 38.17f, 148.07f),
                    PathNode.CurveTo(23.525217f, 149.0369f, 12.112204f, 161.14784f, 12.015243f, 175.82419f),
                    PathNode.CurveTo(11.918283f, 190.50053f, 23.170284f, 202.76123f, 37.80101f, 203.92154f),
                    PathNode.CurveTo(52.43174f, 205.08183f, 65.47563f, 194.74796f, 67.69318f, 180.23979f),
                    PathNode.CurveTo(69.91073f, 165.73163f, 60.549313f, 151.97313f, 46.24f, 148.71f),
                    PathNode.CurveTo(52.991035f, 120.47982f, 73.757454f, 97.68963f, 101.24f, 88.35f),
                    PathNode.CurveTo(104.8882f, 100.046684f, 115.71757f, 108.01291f, 127.97f, 108.01291f),
                    PathNode.CurveTo(140.22243f, 108.01291f, 151.0518f, 100.046684f, 154.7f, 88.35f),
                    PathNode.CurveTo(182.1804f, 97.6929f, 202.94551f, 120.48166f, 209.7f, 148.71f),
                    PathNode.CurveTo(195.39069f, 151.97313f, 186.02928f, 165.73163f, 188.24683f, 180.23979f),
                    PathNode.CurveTo(190.46437f, 194.74796f, 203.50826f, 205.08183f, 218.13899f, 203.92154f),
                    PathNode.CurveTo(232.76971f, 202.76123f, 244.02171f, 190.50053f, 243.92476f, 175.82419f),
                    PathNode.CurveTo(243.82779f, 161.14784f, 232.41478f, 149.0369f, 217.77f, 148.07f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 176.0f),
                    PathNode.CurveTo(60.0f, 187.0457f, 51.045696f, 196.0f, 40.0f, 196.0f),
                    PathNode.CurveTo(28.954306f, 196.0f, 20.0f, 187.0457f, 20.0f, 176.0f),
                    PathNode.CurveTo(20.0f, 164.9543f, 28.954306f, 156.0f, 40.0f, 156.0f),
                    PathNode.CurveTo(51.045696f, 156.0f, 60.0f, 164.9543f, 60.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 100.0f),
                    PathNode.CurveTo(116.95431f, 100.0f, 108.0f, 91.04569f, 108.0f, 80.0f),
                    PathNode.CurveTo(108.0f, 68.95431f, 116.95431f, 60.0f, 128.0f, 60.0f),
                    PathNode.CurveTo(139.0457f, 60.0f, 148.0f, 68.95431f, 148.0f, 80.0f),
                    PathNode.CurveTo(148.0f, 91.04569f, 139.0457f, 100.0f, 128.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 196.0f),
                    PathNode.CurveTo(204.9543f, 196.0f, 196.0f, 187.0457f, 196.0f, 176.0f),
                    PathNode.CurveTo(196.0f, 164.9543f, 204.9543f, 156.0f, 216.0f, 156.0f),
                    PathNode.CurveTo(227.0457f, 156.0f, 236.0f, 164.9543f, 236.0f, 176.0f),
                    PathNode.CurveTo(236.0f, 187.0457f, 227.0457f, 196.0f, 216.0f, 196.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bezierCurve!!
    }

private var _bezierCurve: ImageVector? = null
