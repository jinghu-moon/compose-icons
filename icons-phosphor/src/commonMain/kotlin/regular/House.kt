package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.House: ImageVector
    get() {
        if (_house != null) return _house!!
        _house = phosphorRegularIcon(
            name = "House",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(219.31f, 108.68f),
                    PathNode.LineTo(139.31f, 28.68f),
                    PathNode.CurveTo(133.06245f, 22.436554f, 122.93754f, 22.436554f, 116.69f, 28.68f),
                    PathNode.LineTo(36.69f, 108.68f),
                    PathNode.CurveTo(33.674286f, 111.673325f, 31.984877f, 115.75096f, 32.0f, 120.0f),
                    PathNode.LineTo(32.0f, 216.0f),
                    PathNode.CurveTo(32.0f, 220.41827f, 35.581722f, 224.0f, 40.0f, 224.0f),
                    PathNode.LineTo(104.0f, 224.0f),
                    PathNode.CurveTo(108.41828f, 224.0f, 112.0f, 220.41827f, 112.0f, 216.0f),
                    PathNode.LineTo(112.0f, 160.0f),
                    PathNode.LineTo(144.0f, 160.0f),
                    PathNode.LineTo(144.0f, 216.0f),
                    PathNode.CurveTo(144.0f, 220.41827f, 147.58173f, 224.0f, 152.0f, 224.0f),
                    PathNode.LineTo(216.0f, 224.0f),
                    PathNode.CurveTo(220.41827f, 224.0f, 224.0f, 220.41827f, 224.0f, 216.0f),
                    PathNode.LineTo(224.0f, 120.0f),
                    PathNode.CurveTo(224.01512f, 115.75096f, 222.32571f, 111.673325f, 219.31f, 108.68f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(160.0f, 208.0f),
                    PathNode.LineTo(160.0f, 152.0f),
                    PathNode.CurveTo(160.0f, 147.58173f, 156.41827f, 144.0f, 152.0f, 144.0f),
                    PathNode.LineTo(104.0f, 144.0f),
                    PathNode.CurveTo(99.58172f, 144.0f, 96.0f, 147.58173f, 96.0f, 152.0f),
                    PathNode.LineTo(96.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 120.0f),
                    PathNode.LineTo(128.0f, 40.0f),
                    PathNode.LineTo(208.0f, 120.0f),
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
        return _house!!
    }

private var _house: ImageVector? = null
