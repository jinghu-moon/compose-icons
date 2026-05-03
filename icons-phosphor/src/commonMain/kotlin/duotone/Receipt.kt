package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Receipt: ImageVector
    get() {
        if (_receipt != null) return _receipt!!
        _receipt = phosphorDuotoneIcon(
            name = "Receipt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 56.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.LineTo(192.0f, 192.0f),
                    PathNode.LineTo(160.0f, 208.0f),
                    PathNode.LineTo(128.0f, 192.0f),
                    PathNode.LineTo(96.0f, 208.0f),
                    PathNode.LineTo(64.0f, 192.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 56.0f),
                    PathNode.CurveTo(32.0f, 51.581722f, 35.581722f, 48.0f, 40.0f, 48.0f),
                    PathNode.LineTo(216.0f, 48.0f),
                    PathNode.CurveTo(220.41827f, 48.0f, 224.0f, 51.581722f, 224.0f, 56.0f),
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
                    PathNode.MoveTo(72.0f, 104.0f),
                    PathNode.CurveTo(72.0f, 99.58172f, 75.58172f, 96.0f, 80.0f, 96.0f),
                    PathNode.LineTo(176.0f, 96.0f),
                    PathNode.CurveTo(180.41827f, 96.0f, 184.0f, 99.58172f, 184.0f, 104.0f),
                    PathNode.CurveTo(184.0f, 108.41828f, 180.41827f, 112.0f, 176.0f, 112.0f),
                    PathNode.LineTo(80.0f, 112.0f),
                    PathNode.CurveTo(75.58172f, 112.0f, 72.0f, 108.41828f, 72.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 144.0f),
                    PathNode.LineTo(176.0f, 144.0f),
                    PathNode.CurveTo(180.41827f, 144.0f, 184.0f, 140.41827f, 184.0f, 136.0f),
                    PathNode.CurveTo(184.0f, 131.58173f, 180.41827f, 128.0f, 176.0f, 128.0f),
                    PathNode.LineTo(80.0f, 128.0f),
                    PathNode.CurveTo(75.58172f, 128.0f, 72.0f, 131.58173f, 72.0f, 136.0f),
                    PathNode.CurveTo(72.0f, 140.41827f, 75.58172f, 144.0f, 80.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 56.0f),
                    PathNode.LineTo(232.0f, 208.0f),
                    PathNode.CurveTo(231.9985f, 210.77232f, 230.56184f, 213.34625f, 228.20294f, 214.80273f),
                    PathNode.CurveTo(225.84402f, 216.25922f, 222.89923f, 216.39061f, 220.42f, 215.15f),
                    PathNode.LineTo(192.0f, 200.94f),
                    PathNode.LineTo(163.58f, 215.15f),
                    PathNode.CurveTo(161.32652f, 216.27763f, 158.67348f, 216.27763f, 156.42f, 215.15f),
                    PathNode.LineTo(128.0f, 200.94f),
                    PathNode.LineTo(99.58f, 215.15f),
                    PathNode.CurveTo(97.32653f, 216.27763f, 94.67347f, 216.27763f, 92.42f, 215.15f),
                    PathNode.LineTo(64.0f, 200.94f),
                    PathNode.LineTo(35.58f, 215.15f),
                    PathNode.CurveTo(33.10076f, 216.39061f, 30.155952f, 216.25922f, 27.797056f, 214.80273f),
                    PathNode.CurveTo(25.438162f, 213.34625f, 24.00148f, 210.77232f, 24.0f, 208.0f),
                    PathNode.LineTo(24.0f, 56.0f),
                    PathNode.CurveTo(24.0f, 47.163445f, 31.163445f, 40.0f, 40.0f, 40.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(224.83656f, 40.0f, 232.0f, 47.163445f, 232.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 56.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.LineTo(40.0f, 195.06f),
                    PathNode.LineTo(60.42f, 184.84f),
                    PathNode.CurveTo(62.673473f, 183.71236f, 65.32653f, 183.71236f, 67.58f, 184.84f),
                    PathNode.LineTo(96.0f, 199.06f),
                    PathNode.LineTo(124.42f, 184.84f),
                    PathNode.CurveTo(126.67347f, 183.71236f, 129.32652f, 183.71236f, 131.58f, 184.84f),
                    PathNode.LineTo(160.0f, 199.06f),
                    PathNode.LineTo(188.42f, 184.84f),
                    PathNode.CurveTo(190.67348f, 183.71236f, 193.32652f, 183.71236f, 195.58f, 184.84f),
                    PathNode.LineTo(216.0f, 195.06f),
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
        return _receipt!!
    }

private var _receipt: ImageVector? = null
