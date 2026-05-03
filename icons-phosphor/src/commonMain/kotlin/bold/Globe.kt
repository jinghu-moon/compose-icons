package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Globe: ImageVector
    get() {
        if (_globe != null) return _globe!!
        _globe = phosphorBoldIcon(
            name = "Globe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 207.0f),
                    PathNode.CurveTo(119.157875f, 196.6516f, 112.251045f, 184.79584f, 107.61f, 172.0f),
                    PathNode.LineTo(148.43f, 172.0f),
                    PathNode.CurveTo(145.78885f, 179.23578f, 142.43925f, 186.1929f, 138.43f, 192.77f),
                    PathNode.CurveTo(135.34499f, 197.78833f, 131.85681f, 202.54736f, 128.0f, 207.0f),
                    PathNode.Close,
                    PathNode.MoveTo(101.51f, 148.0f),
                    PathNode.CurveTo(99.52996f, 134.74017f, 99.52996f, 121.25983f, 101.51f, 108.0f),
                    PathNode.LineTo(154.51f, 108.0f),
                    PathNode.CurveTo(156.49004f, 121.25983f, 156.49004f, 134.74017f, 154.51f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 128.0f),
                    PathNode.CurveTo(43.999714f, 121.25968f, 44.81565f, 114.544136f, 46.43f, 108.0f),
                    PathNode.LineTo(77.25f, 108.0f),
                    PathNode.CurveTo(75.58339f, 121.28125f, 75.58339f, 134.71875f, 77.25f, 148.0f),
                    PathNode.LineTo(46.43f, 148.0f),
                    PathNode.CurveTo(44.81565f, 141.45586f, 43.999714f, 134.74031f, 44.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 49.0f),
                    PathNode.CurveTo(136.84212f, 59.348404f, 143.74895f, 71.20417f, 148.39f, 84.0f),
                    PathNode.LineTo(107.59f, 84.0f),
                    PathNode.CurveTo(110.23115f, 76.76422f, 113.58075f, 69.80709f, 117.59f, 63.23f),
                    PathNode.CurveTo(120.668625f, 58.212387f, 124.15009f, 53.453377f, 128.0f, 49.0f),
                    PathNode.Close,
                    PathNode.MoveTo(178.73f, 108.0f),
                    PathNode.LineTo(209.55f, 108.0f),
                    PathNode.CurveTo(212.78998f, 121.136505f, 212.78998f, 134.8635f, 209.55f, 148.0f),
                    PathNode.LineTo(178.75f, 148.0f),
                    PathNode.CurveTo(180.41661f, 134.71875f, 180.41661f, 121.28125f, 178.75f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(199.5f, 84.0f),
                    PathNode.LineTo(173.71f, 84.0f),
                    PathNode.CurveTo(170.1065f, 71.9038f, 164.89314f, 60.346954f, 158.21f, 49.64f),
                    PathNode.CurveTo(175.35132f, 56.294247f, 189.85469f, 68.35757f, 199.52f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(97.79f, 49.64f),
                    PathNode.CurveTo(91.10686f, 60.346954f, 85.89349f, 71.9038f, 82.29f, 84.0f),
                    PathNode.LineTo(56.48f, 84.0f),
                    PathNode.CurveTo(66.14531f, 68.35757f, 80.648674f, 56.294247f, 97.79f, 49.64f),
                    PathNode.Close,
                    PathNode.MoveTo(56.48f, 172.0f),
                    PathNode.LineTo(82.29f, 172.0f),
                    PathNode.CurveTo(85.89349f, 184.0962f, 91.10686f, 195.65305f, 97.79f, 206.36f),
                    PathNode.CurveTo(80.648674f, 199.70575f, 66.14531f, 187.64244f, 56.48f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(158.21f, 206.36f),
                    PathNode.CurveTo(164.89314f, 195.65305f, 170.1065f, 184.0962f, 173.71f, 172.0f),
                    PathNode.LineTo(199.52f, 172.0f),
                    PathNode.CurveTo(189.85469f, 187.64244f, 175.35132f, 199.70575f, 158.21f, 206.36f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _globe!!
    }

private var _globe: ImageVector? = null
