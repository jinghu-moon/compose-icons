package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Lamp: ImageVector
    get() {
        if (_lamp != null) return _lamp!!
        _lamp = phosphorFillIcon(
            name = "Lamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(246.68f, 156.4f),
                    PathNode.CurveTo(245.20032f, 158.64688f, 242.69034f, 159.99956f, 240.0f, 160.0f),
                    PathNode.LineTo(208.0f, 160.0f),
                    PathNode.LineTo(208.0f, 192.0f),
                    PathNode.CurveTo(208.0f, 196.41827f, 204.41827f, 200.0f, 200.0f, 200.0f),
                    PathNode.CurveTo(195.58173f, 200.0f, 192.0f, 196.41827f, 192.0f, 192.0f),
                    PathNode.LineTo(192.0f, 160.0f),
                    PathNode.LineTo(136.0f, 160.0f),
                    PathNode.LineTo(136.0f, 208.0f),
                    PathNode.LineTo(160.0f, 208.0f),
                    PathNode.CurveTo(164.41827f, 208.0f, 168.0f, 211.58173f, 168.0f, 216.0f),
                    PathNode.CurveTo(168.0f, 220.41827f, 164.41827f, 224.0f, 160.0f, 224.0f),
                    PathNode.LineTo(96.0f, 224.0f),
                    PathNode.CurveTo(91.58172f, 224.0f, 88.0f, 220.41827f, 88.0f, 216.0f),
                    PathNode.CurveTo(88.0f, 211.58173f, 91.58172f, 208.0f, 96.0f, 208.0f),
                    PathNode.LineTo(120.0f, 208.0f),
                    PathNode.LineTo(120.0f, 160.0f),
                    PathNode.LineTo(16.0f, 160.0f),
                    PathNode.CurveTo(13.31178f, 159.99875f, 10.80391f, 158.64743f, 9.324388f, 156.40298f),
                    PathNode.CurveTo(7.844865f, 154.15854f, 7.591513f, 151.32106f, 8.65f, 148.85f),
                    PathNode.LineTo(56.65f, 36.85f),
                    PathNode.CurveTo(57.909763f, 33.909054f, 60.8006f, 32.001495f, 64.0f, 32.0f),
                    PathNode.LineTo(192.0f, 32.0f),
                    PathNode.CurveTo(195.1994f, 32.001495f, 198.09024f, 33.909054f, 199.35f, 36.85f),
                    PathNode.LineTo(247.35f, 148.85f),
                    PathNode.CurveTo(248.4087f, 151.31949f, 248.15703f, 154.15553f, 246.68f, 156.4f),
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
        return _lamp!!
    }

private var _lamp: ImageVector? = null
