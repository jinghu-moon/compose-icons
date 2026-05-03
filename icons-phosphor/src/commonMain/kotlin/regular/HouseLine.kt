package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HouseLine: ImageVector
    get() {
        if (_houseLine != null) return _houseLine!!
        _houseLine = phosphorRegularIcon(
            name = "HouseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 208.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 136.0f),
                    PathNode.LineTo(226.34f, 138.34f),
                    PathNode.CurveTo(229.47145f, 141.46593f, 234.54407f, 141.46146f, 237.67f, 138.33f),
                    PathNode.CurveTo(240.79593f, 135.19855f, 240.79146f, 130.12593f, 237.66f, 127.0f),
                    PathNode.LineTo(139.31f, 28.68f),
                    PathNode.CurveTo(133.06245f, 22.436554f, 122.93754f, 22.436554f, 116.69f, 28.68f),
                    PathNode.LineTo(18.34f, 127.0f),
                    PathNode.CurveTo(15.21683f, 130.12593f, 15.219069f, 135.19183f, 18.345f, 138.315f),
                    PathNode.CurveTo(21.470932f, 141.43817f, 26.536827f, 141.43594f, 29.66f, 138.31f),
                    PathNode.LineTo(32.0f, 136.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.LineTo(16.0f, 208.0f),
                    PathNode.CurveTo(11.581722f, 208.0f, 8.0f, 211.58173f, 8.0f, 216.0f),
                    PathNode.CurveTo(8.0f, 220.41827f, 11.581722f, 224.0f, 16.0f, 224.0f),
                    PathNode.LineTo(240.0f, 224.0f),
                    PathNode.CurveTo(244.41827f, 224.0f, 248.0f, 220.41827f, 248.0f, 216.0f),
                    PathNode.CurveTo(248.0f, 211.58173f, 244.41827f, 208.0f, 240.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 120.0f),
                    PathNode.LineTo(128.0f, 40.0f),
                    PathNode.LineTo(208.0f, 120.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.LineTo(160.0f, 208.0f),
                    PathNode.LineTo(160.0f, 152.0f),
                    PathNode.CurveTo(160.0f, 147.58173f, 156.41827f, 144.0f, 152.0f, 144.0f),
                    PathNode.LineTo(104.0f, 144.0f),
                    PathNode.CurveTo(99.58172f, 144.0f, 96.0f, 147.58173f, 96.0f, 152.0f),
                    PathNode.LineTo(96.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 208.0f),
                    PathNode.LineTo(112.0f, 208.0f),
                    PathNode.LineTo(112.0f, 160.0f),
                    PathNode.LineTo(144.0f, 160.0f),
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
        return _houseLine!!
    }

private var _houseLine: ImageVector? = null
