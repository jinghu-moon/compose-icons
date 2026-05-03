package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Lamp: ImageVector
    get() {
        if (_lamp != null) return _lamp!!
        _lamp = phosphorDuotoneIcon(
            name = "Lamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 152.0f),
                    PathNode.LineTo(16.0f, 152.0f),
                    PathNode.LineTo(64.0f, 40.0f),
                    PathNode.LineTo(192.0f, 40.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(247.35f, 148.85f),
                    PathNode.LineTo(199.35f, 36.85f),
                    PathNode.CurveTo(198.09024f, 33.909054f, 195.1994f, 32.001495f, 192.0f, 32.0f),
                    PathNode.LineTo(64.0f, 32.0f),
                    PathNode.CurveTo(60.8006f, 32.001495f, 57.909763f, 33.909054f, 56.65f, 36.85f),
                    PathNode.LineTo(8.65f, 148.85f),
                    PathNode.CurveTo(7.591513f, 151.32106f, 7.844865f, 154.15854f, 9.324388f, 156.40298f),
                    PathNode.CurveTo(10.80391f, 158.64743f, 13.31178f, 159.99875f, 16.0f, 160.0f),
                    PathNode.LineTo(120.0f, 160.0f),
                    PathNode.LineTo(120.0f, 208.0f),
                    PathNode.LineTo(96.0f, 208.0f),
                    PathNode.CurveTo(91.58172f, 208.0f, 88.0f, 211.58173f, 88.0f, 216.0f),
                    PathNode.CurveTo(88.0f, 220.41827f, 91.58172f, 224.0f, 96.0f, 224.0f),
                    PathNode.LineTo(160.0f, 224.0f),
                    PathNode.CurveTo(164.41827f, 224.0f, 168.0f, 220.41827f, 168.0f, 216.0f),
                    PathNode.CurveTo(168.0f, 211.58173f, 164.41827f, 208.0f, 160.0f, 208.0f),
                    PathNode.LineTo(136.0f, 208.0f),
                    PathNode.LineTo(136.0f, 160.0f),
                    PathNode.LineTo(192.0f, 160.0f),
                    PathNode.LineTo(192.0f, 192.0f),
                    PathNode.CurveTo(192.0f, 196.41827f, 195.58173f, 200.0f, 200.0f, 200.0f),
                    PathNode.CurveTo(204.41827f, 200.0f, 208.0f, 196.41827f, 208.0f, 192.0f),
                    PathNode.LineTo(208.0f, 160.0f),
                    PathNode.LineTo(240.0f, 160.0f),
                    PathNode.CurveTo(242.68822f, 159.99875f, 245.19609f, 158.64743f, 246.67561f, 156.40298f),
                    PathNode.CurveTo(248.15514f, 154.15854f, 248.4085f, 151.32106f, 247.35f, 148.85f),
                    PathNode.Close,
                    PathNode.MoveTo(28.13f, 144.0f),
                    PathNode.LineTo(69.28f, 48.0f),
                    PathNode.LineTo(186.72f, 48.0f),
                    PathNode.LineTo(227.87f, 144.0f),
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
        return _lamp!!
    }

private var _lamp: ImageVector? = null
