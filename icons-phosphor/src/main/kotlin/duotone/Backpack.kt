package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Backpack: ImageVector
    get() {
        if (_backpack != null) return _backpack!!
        _backpack = phosphorDuotoneIcon(
            name = "Backpack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 96.0f),
                    PathNode.LineTo(208.0f, 216.0f),
                    PathNode.CurveTo(208.0f, 220.41827f, 204.41827f, 224.0f, 200.0f, 224.0f),
                    PathNode.LineTo(176.0f, 224.0f),
                    PathNode.LineTo(176.0f, 152.0f),
                    PathNode.CurveTo(176.0f, 143.16344f, 168.83656f, 136.0f, 160.0f, 136.0f),
                    PathNode.LineTo(96.0f, 136.0f),
                    PathNode.CurveTo(87.163445f, 136.0f, 80.0f, 143.16344f, 80.0f, 152.0f),
                    PathNode.LineTo(80.0f, 224.0f),
                    PathNode.LineTo(56.0f, 224.0f),
                    PathNode.CurveTo(51.581722f, 224.0f, 48.0f, 220.41827f, 48.0f, 216.0f),
                    PathNode.LineTo(48.0f, 96.0f),
                    PathNode.CurveTo(48.0f, 69.49033f, 69.49033f, 48.0f, 96.0f, 48.0f),
                    PathNode.LineTo(160.0f, 48.0f),
                    PathNode.CurveTo(186.50967f, 48.0f, 208.0f, 69.49033f, 208.0f, 96.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 40.58f),
                    PathNode.LineTo(168.0f, 32.0f),
                    PathNode.CurveTo(168.0f, 18.745167f, 157.25484f, 8.0f, 144.0f, 8.0f),
                    PathNode.LineTo(112.0f, 8.0f),
                    PathNode.CurveTo(98.74516f, 8.0f, 88.0f, 18.745167f, 88.0f, 32.0f),
                    PathNode.LineTo(88.0f, 40.58f),
                    PathNode.CurveTo(60.469845f, 44.592667f, 40.041428f, 68.17898f, 40.0f, 96.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(40.0f, 224.83656f, 47.163445f, 232.0f, 56.0f, 232.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(208.83656f, 232.0f, 216.0f, 224.83656f, 216.0f, 216.0f),
                    PathNode.LineTo(216.0f, 96.0f),
                    PathNode.CurveTo(215.95857f, 68.17898f, 195.53015f, 44.592667f, 168.0f, 40.58f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 24.0f),
                    PathNode.LineTo(144.0f, 24.0f),
                    PathNode.CurveTo(148.41827f, 24.0f, 152.0f, 27.581722f, 152.0f, 32.0f),
                    PathNode.LineTo(152.0f, 40.0f),
                    PathNode.LineTo(104.0f, 40.0f),
                    PathNode.LineTo(104.0f, 32.0f),
                    PathNode.CurveTo(104.0f, 27.581722f, 107.58172f, 24.0f, 112.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 160.0f),
                    PathNode.LineTo(88.0f, 160.0f),
                    PathNode.LineTo(88.0f, 152.0f),
                    PathNode.CurveTo(88.0f, 147.58173f, 91.58172f, 144.0f, 96.0f, 144.0f),
                    PathNode.LineTo(160.0f, 144.0f),
                    PathNode.CurveTo(164.41827f, 144.0f, 168.0f, 147.58173f, 168.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 176.0f),
                    PathNode.LineTo(136.0f, 176.0f),
                    PathNode.LineTo(136.0f, 184.0f),
                    PathNode.CurveTo(136.0f, 188.41827f, 139.58173f, 192.0f, 144.0f, 192.0f),
                    PathNode.CurveTo(148.41827f, 192.0f, 152.0f, 188.41827f, 152.0f, 184.0f),
                    PathNode.LineTo(152.0f, 176.0f),
                    PathNode.LineTo(168.0f, 176.0f),
                    PathNode.LineTo(168.0f, 216.0f),
                    PathNode.LineTo(88.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 216.0f),
                    PathNode.LineTo(184.0f, 216.0f),
                    PathNode.LineTo(184.0f, 152.0f),
                    PathNode.CurveTo(184.0f, 138.74516f, 173.25484f, 128.0f, 160.0f, 128.0f),
                    PathNode.LineTo(96.0f, 128.0f),
                    PathNode.CurveTo(82.74516f, 128.0f, 72.0f, 138.74516f, 72.0f, 152.0f),
                    PathNode.LineTo(72.0f, 216.0f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.LineTo(56.0f, 96.0f),
                    PathNode.CurveTo(56.0f, 73.90861f, 73.90861f, 56.0f, 96.0f, 56.0f),
                    PathNode.LineTo(160.0f, 56.0f),
                    PathNode.CurveTo(182.09138f, 56.0f, 200.0f, 73.90861f, 200.0f, 96.0f),
                    PathNode.LineTo(200.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 88.0f),
                    PathNode.CurveTo(152.0f, 92.41828f, 148.41827f, 96.0f, 144.0f, 96.0f),
                    PathNode.LineTo(112.0f, 96.0f),
                    PathNode.CurveTo(107.58172f, 96.0f, 104.0f, 92.41828f, 104.0f, 88.0f),
                    PathNode.CurveTo(104.0f, 83.58172f, 107.58172f, 80.0f, 112.0f, 80.0f),
                    PathNode.LineTo(144.0f, 80.0f),
                    PathNode.CurveTo(148.41827f, 80.0f, 152.0f, 83.58172f, 152.0f, 88.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _backpack!!
    }

private var _backpack: ImageVector? = null
