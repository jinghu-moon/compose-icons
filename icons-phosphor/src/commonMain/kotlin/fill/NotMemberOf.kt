package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NotMemberOf: ImageVector
    get() {
        if (_notMemberOf != null) return _notMemberOf!!
        _notMemberOf = phosphorFillIcon(
            name = "NotMemberOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(190.0f, 69.27f),
                    PathNode.LineTo(145.63f, 120.0f),
                    PathNode.LineTo(176.0f, 120.0f),
                    PathNode.CurveTo(180.41827f, 120.0f, 184.0f, 123.58172f, 184.0f, 128.0f),
                    PathNode.CurveTo(184.0f, 132.41827f, 180.41827f, 136.0f, 176.0f, 136.0f),
                    PathNode.LineTo(131.63f, 136.0f),
                    PathNode.LineTo(102.87f, 168.87f),
                    PathNode.CurveTo(110.42047f, 173.5377f, 119.12322f, 176.00691f, 128.0f, 176.0f),
                    PathNode.LineTo(176.0f, 176.0f),
                    PathNode.CurveTo(180.41827f, 176.0f, 184.0f, 179.58173f, 184.0f, 184.0f),
                    PathNode.CurveTo(184.0f, 188.41827f, 180.41827f, 192.0f, 176.0f, 192.0f),
                    PathNode.LineTo(128.0f, 192.0f),
                    PathNode.CurveTo(115.2401f, 192.0044f, 102.7737f, 188.1718f, 92.22f, 181.0f),
                    PathNode.LineTo(78.0f, 197.27f),
                    PathNode.CurveTo(75.02193f, 200.2785f, 70.21565f, 200.4462f, 67.03511f, 197.65262f),
                    PathNode.CurveTo(63.85457f, 194.85905f, 63.400845f, 190.07132f, 66.0f, 186.73f),
                    PathNode.LineTo(80.21f, 170.49f),
                    PathNode.CurveTo(63.490906f, 151.65785f, 59.369705f, 124.771484f, 69.68046f, 101.79614f),
                    PathNode.CurveTo(79.9912f, 78.8208f, 102.81712f, 64.02761f, 128.0f, 64.0f),
                    PathNode.LineTo(173.37f, 64.0f),
                    PathNode.LineTo(178.0f, 58.73f),
                    PathNode.CurveTo(179.8248f, 56.384167f, 182.79962f, 55.243263f, 185.72505f, 55.767292f),
                    PathNode.CurveTo(188.6505f, 56.291317f, 191.04433f, 58.3939f, 191.94138f, 61.227287f),
                    PathNode.CurveTo(192.83842f, 64.06068f, 192.09082f, 67.15783f, 190.0f, 69.27f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 80.0f),
                    PathNode.LineTo(159.37f, 80.0f),
                    PathNode.LineTo(124.37f, 120.0f),
                    PathNode.LineTo(80.68f, 120.0f),
                    PathNode.CurveTo(84.60984f, 96.92347f, 104.59126f, 80.033005f, 128.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.68f, 136.0f),
                    PathNode.LineTo(110.37f, 136.0f),
                    PathNode.LineTo(90.84f, 158.32f),
                    PathNode.CurveTo(85.56916f, 151.89062f, 82.06714f, 144.19722f, 80.68f, 136.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _notMemberOf!!
    }

private var _notMemberOf: ImageVector? = null
