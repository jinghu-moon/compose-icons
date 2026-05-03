package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BeachBall: ImageVector
    get() {
        if (_beachBall != null) return _beachBall!!
        _beachBall = phosphorFillIcon(
            name = "BeachBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(211.44f, 100.0f),
                    PathNode.CurveTo(196.38042f, 95.13498f, 180.78671f, 92.11295f, 165.0f, 91.0f),
                    PathNode.CurveTo(163.88705f, 75.213264f, 160.86502f, 59.619587f, 156.0f, 44.56f),
                    PathNode.CurveTo(182.1102f, 53.39003f, 202.60997f, 73.88981f, 211.44f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(85.0f, 51.24f),
                    PathNode.CurveTo(109.921234f, 59.47594f, 132.84506f, 72.83171f, 152.3f, 90.45f),
                    PathNode.CurveTo(112.29651f, 90.10254f, 73.14188f, 101.9864f, 40.08f, 124.51f),
                    PathNode.CurveTo(41.31143f, 93.94255f, 58.3173f, 66.20391f, 85.0f, 51.24f),
                    PathNode.Close,
                    PathNode.MoveTo(131.48f, 215.92f),
                    PathNode.CurveTo(154.00555f, 182.85532f, 165.88951f, 143.6969f, 165.54f, 103.69f),
                    PathNode.CurveTo(183.16307f, 123.14696f, 196.52235f, 146.07437f, 204.76f, 171.0f),
                    PathNode.CurveTo(189.7961f, 197.68271f, 162.05745f, 214.68858f, 131.49f, 215.92f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _beachBall!!
    }

private var _beachBall: ImageVector? = null
