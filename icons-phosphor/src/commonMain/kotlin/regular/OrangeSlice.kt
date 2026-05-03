package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.OrangeSlice: ImageVector
    get() {
        if (_orangeSlice != null) return _orangeSlice!!
        _orangeSlice = phosphorRegularIcon(
            name = "OrangeSlice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 80.0f),
                    PathNode.LineTo(8.0f, 80.0f),
                    PathNode.CurveTo(3.581722f, 80.0f, 0f, 83.58172f, 0f, 88.0f),
                    PathNode.CurveTo(0f, 158.69244f, 57.307552f, 216.0f, 128.0f, 216.0f),
                    PathNode.CurveTo(198.69244f, 216.0f, 256.0f, 158.69244f, 256.0f, 88.0f),
                    PathNode.CurveTo(256.0f, 83.58172f, 252.41827f, 80.0f, 248.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(77.4f, 149.91f),
                    PathNode.LineTo(120.0f, 107.31f),
                    PathNode.LineTo(120.0f, 167.6f),
                    PathNode.CurveTo(104.36513f, 166.03767f, 89.542496f, 159.88246f, 77.4f, 149.91f),
                    PathNode.Close,
                    PathNode.MoveTo(66.09f, 138.6f),
                    PathNode.CurveTo(56.117542f, 126.457504f, 49.962322f, 111.63487f, 48.4f, 96.0f),
                    PathNode.LineTo(108.69f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 107.31f),
                    PathNode.LineTo(178.6f, 149.91f),
                    PathNode.CurveTo(166.4575f, 159.88246f, 151.63487f, 166.03767f, 136.0f, 167.6f),
                    PathNode.Close,
                    PathNode.MoveTo(189.91f, 138.6f),
                    PathNode.LineTo(147.31f, 96.0f),
                    PathNode.LineTo(207.6f, 96.0f),
                    PathNode.CurveTo(206.03767f, 111.63487f, 199.88246f, 126.457504f, 189.91f, 138.6f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 200.0f),
                    PathNode.CurveTo(69.27475f, 199.9301f, 20.547556f, 154.57002f, 16.28f, 96.0f),
                    PathNode.LineTo(32.34f, 96.0f),
                    PathNode.CurveTo(36.535145f, 145.71324f, 78.11006f, 183.92755f, 128.0f, 183.92755f),
                    PathNode.CurveTo(177.88994f, 183.92755f, 219.46486f, 145.71324f, 223.66f, 96.0f),
                    PathNode.LineTo(239.72f, 96.0f),
                    PathNode.CurveTo(235.45244f, 154.57002f, 186.72525f, 199.9301f, 128.0f, 200.0f),
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
        return _orangeSlice!!
    }

private var _orangeSlice: ImageVector? = null
