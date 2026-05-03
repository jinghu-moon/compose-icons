package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Tent: ImageVector
    get() {
        if (_tent != null) return _tent!!
        _tent = phosphorRegularIcon(
            name = "Tent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(255.31f, 188.75f),
                    PathNode.LineTo(191.31f, 44.75f),
                    PathNode.CurveTo(190.02579f, 41.86149f, 187.16112f, 40.00004f, 184.0f, 40.0f),
                    PathNode.LineTo(72.0f, 40.0f),
                    PathNode.CurveTo(68.86744f, 40.005142f, 66.02609f, 41.83814f, 64.73f, 44.69f),
                    PathNode.CurveTo(64.72713f, 44.709896f, 64.72713f, 44.730103f, 64.73f, 44.75f),
                    PathNode.LineTo(64.73f, 44.87f),
                    PathNode.LineTo(64.73f, 44.87f),
                    PathNode.LineTo(0.69f, 188.75f),
                    PathNode.CurveTo(-0.410212f, 191.22467f, -0.183725f, 194.08794f, 1.291866f, 196.35887f),
                    PathNode.CurveTo(2.767457f, 198.62978f, 5.291785f, 199.99997f, 8.0f, 200.0f),
                    PathNode.LineTo(248.0f, 200.0f),
                    PathNode.CurveTo(250.70822f, 199.99997f, 253.23254f, 198.62978f, 254.70813f, 196.35887f),
                    PathNode.CurveTo(256.18372f, 194.08794f, 256.41022f, 191.22467f, 255.31f, 188.75f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 184.0f),
                    PathNode.LineTo(20.31f, 184.0f),
                    PathNode.LineTo(64.0f, 85.7f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 184.0f),
                    PathNode.LineTo(80.0f, 85.7f),
                    PathNode.LineTo(123.69f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(141.2f, 184.0f),
                    PathNode.LineTo(84.31f, 56.0f),
                    PathNode.LineTo(178.8f, 56.0f),
                    PathNode.LineTo(235.69f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _tent!!
    }

private var _tent: ImageVector? = null
