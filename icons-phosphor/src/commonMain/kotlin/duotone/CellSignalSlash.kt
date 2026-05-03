package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CellSignalSlash: ImageVector
    get() {
        if (_cellSignalSlash != null) return _cellSignalSlash!!
        _cellSignalSlash = phosphorDuotoneIcon(
            name = "CellSignalSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 40.0f),
                    PathNode.LineTo(200.0f, 200.0f),
                    PathNode.CurveTo(200.0f, 204.41827f, 196.41827f, 208.0f, 192.0f, 208.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(28.762346f, 208.00255f, 25.842361f, 206.05338f, 24.60302f, 203.06232f),
                    PathNode.CurveTo(23.36368f, 200.07126f, 24.049358f, 196.6281f, 26.34f, 194.34f),
                    PathNode.LineTo(186.34f, 34.34f),
                    PathNode.CurveTo(188.6281f, 32.04936f, 192.07126f, 31.36368f, 195.06232f, 32.60302f),
                    PathNode.CurveTo(198.05338f, 33.84236f, 200.00255f, 36.76235f, 200.0f, 40.0f),
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
                    PathNode.MoveTo(213.92f, 210.62f),
                    PathNode.LineTo(53.92f, 34.62f),
                    PathNode.CurveTo(50.948708f, 31.347713f, 45.887287f, 31.103708f, 42.615f, 34.075f),
                    PathNode.CurveTo(39.342712f, 37.04629f, 39.09871f, 42.10771f, 42.07f, 45.38f),
                    PathNode.LineTo(100.14f, 109.24f),
                    PathNode.LineTo(20.69f, 188.68f),
                    PathNode.CurveTo(16.110008f, 193.2549f, 14.738017f, 200.13881f, 17.214132f, 206.12003f),
                    PathNode.CurveTo(19.690248f, 212.10123f, 25.526514f, 216.00105f, 32.0f, 216.0f),
                    PathNode.LineTo(192.0f, 216.0f),
                    PathNode.CurveTo(193.54472f, 215.99286f, 195.0804f, 215.76385f, 196.56f, 215.32f),
                    PathNode.LineTo(202.08f, 221.38f),
                    PathNode.CurveTo(203.9919f, 223.53516f, 206.91493f, 224.49586f, 209.73259f, 223.89514f),
                    PathNode.CurveTo(212.55025f, 223.29443f, 214.82729f, 221.2251f, 215.69395f, 218.47755f),
                    PathNode.CurveTo(216.56061f, 215.73003f, 215.88303f, 212.7287f, 213.92f, 210.62f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 200.0f),
                    PathNode.LineTo(110.9f, 121.11f),
                    PathNode.LineTo(182.64f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.18f, 92.51f),
                    PathNode.CurveTo(125.05828f, 89.38623f, 125.05828f, 84.32377f, 128.18f, 81.2f),
                    PathNode.LineTo(180.69f, 28.7f),
                    PathNode.CurveTo(185.26456f, 24.12844f, 192.14139f, 22.760359f, 198.11732f, 25.233006f),
                    PathNode.CurveTo(204.09325f, 27.70565f, 207.99297f, 33.532726f, 208.0f, 40.0f),
                    PathNode.LineTo(208.0f, 159.63f),
                    PathNode.CurveTo(208.0f, 164.04828f, 204.41827f, 167.63f, 200.0f, 167.63f),
                    PathNode.CurveTo(195.58173f, 167.63f, 192.0f, 164.04828f, 192.0f, 159.63f),
                    PathNode.LineTo(192.0f, 40.0f),
                    PathNode.LineTo(139.5f, 92.51f),
                    PathNode.CurveTo(137.99945f, 94.012215f, 135.96329f, 94.85629f, 133.84f, 94.85629f),
                    PathNode.CurveTo(131.71672f, 94.85629f, 129.68054f, 94.012215f, 128.18f, 92.51f),
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
        return _cellSignalSlash!!
    }

private var _cellSignalSlash: ImageVector? = null
