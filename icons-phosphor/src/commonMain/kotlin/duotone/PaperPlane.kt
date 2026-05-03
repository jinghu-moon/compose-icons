package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) return _paperPlane!!
        _paperPlane = phosphorDuotoneIcon(
            name = "PaperPlane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.28f, 215.51f),
                    PathNode.LineTo(128.0f, 184.0f),
                    PathNode.LineTo(34.72f, 215.51f),
                    PathNode.CurveTo(31.58001f, 216.63008f, 28.074577f, 215.68553f, 25.922441f, 213.13947f),
                    PathNode.CurveTo(23.770306f, 210.59341f, 23.422676f, 206.97963f, 25.05f, 204.07f),
                    PathNode.LineTo(120.9f, 36.07f),
                    PathNode.CurveTo(122.30895f, 33.52347f, 124.989685f, 31.942984f, 127.9f, 31.942984f),
                    PathNode.CurveTo(130.81032f, 31.942984f, 133.49104f, 33.52347f, 134.9f, 36.07f),
                    PathNode.LineTo(230.99f, 204.07f),
                    PathNode.CurveTo(232.6315f, 206.98721f, 232.28325f, 210.61797f, 230.11717f, 213.16997f),
                    PathNode.CurveTo(227.9511f, 215.72197f, 224.42519f, 216.65561f, 221.28f, 215.51f),
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
                    PathNode.MoveTo(237.9f, 200.1f),
                    PathNode.LineTo(141.85f, 32.18f),
                    PathNode.CurveTo(139.01605f, 27.142176f, 133.68523f, 24.024551f, 127.905f, 24.024551f),
                    PathNode.CurveTo(122.12478f, 24.024551f, 116.79395f, 27.142176f, 113.96f, 32.18f),
                    PathNode.LineTo(18.07f, 200.18f),
                    PathNode.CurveTo(14.814609f, 205.98636f, 15.494326f, 213.20172f, 19.77679f, 218.29799f),
                    PathNode.CurveTo(24.059256f, 223.39426f, 31.049692f, 225.30663f, 37.33f, 223.1f),
                    PathNode.LineTo(128.0f, 192.45f),
                    PathNode.LineTo(218.67f, 223.08f),
                    PathNode.CurveTo(220.38266f, 223.68282f, 222.18436f, 223.9938f, 224.0f, 224.0f),
                    PathNode.CurveTo(229.68608f, 223.98094f, 234.93488f, 220.94556f, 237.7874f, 216.02672f),
                    PathNode.CurveTo(240.63991f, 211.10786f, 240.66756f, 205.04465f, 237.86f, 200.1f),
                    PathNode.Close,
                    PathNode.MoveTo(223.85f, 207.94f),
                    PathNode.LineTo(136.0f, 178.26f),
                    PathNode.LineTo(136.0f, 120.0f),
                    PathNode.CurveTo(136.0f, 115.58172f, 132.41827f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(123.58172f, 112.0f, 120.0f, 115.58172f, 120.0f, 120.0f),
                    PathNode.LineTo(120.0f, 178.26f),
                    PathNode.LineTo(32.16f, 207.94f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.LineTo(127.86f, 40.0f),
                    PathNode.LineTo(224.0f, 208.0f),
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
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
