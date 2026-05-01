package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BellSimple: ImageVector
    get() {
        if (_bellSimple != null) return _bellSimple!!
        _bellSimple = phosphorRegularIcon(
            name = "BellSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 224.0f),
                    PathNode.CurveTo(168.0f, 228.41827f, 164.41827f, 232.0f, 160.0f, 232.0f),
                    PathNode.LineTo(96.0f, 232.0f),
                    PathNode.CurveTo(91.58172f, 232.0f, 88.0f, 228.41827f, 88.0f, 224.0f),
                    PathNode.CurveTo(88.0f, 219.58173f, 91.58172f, 216.0f, 96.0f, 216.0f),
                    PathNode.LineTo(160.0f, 216.0f),
                    PathNode.CurveTo(164.41827f, 216.0f, 168.0f, 219.58173f, 168.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(221.85f, 192.0f),
                    PathNode.CurveTo(219.02374f, 196.97903f, 213.72511f, 200.03961f, 208.0f, 200.0f),
                    PathNode.LineTo(48.0f, 200.0f),
                    PathNode.CurveTo(42.275215f, 199.99228f, 36.99078f, 196.92653f, 34.14249f, 191.96059f),
                    PathNode.CurveTo(31.2942f, 186.99466f, 31.316132f, 180.88536f, 34.2f, 175.94f),
                    PathNode.CurveTo(39.75f, 166.38f, 48.0f, 139.34f, 48.0f, 104.0f),
                    PathNode.CurveTo(48.0f, 59.81722f, 83.81722f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(172.18279f, 24.0f, 208.0f, 59.81722f, 208.0f, 104.0f),
                    PathNode.CurveTo(208.0f, 139.33f, 216.26f, 166.38f, 221.81f, 175.94f),
                    PathNode.CurveTo(224.72365f, 180.89397f, 224.73512f, 187.03517f, 221.84f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 184.0f),
                    PathNode.CurveTo(200.27f, 170.73f, 192.0f, 140.05f, 192.0f, 104.0f),
                    PathNode.CurveTo(192.0f, 68.65378f, 163.34622f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(92.65378f, 40.0f, 64.0f, 68.65378f, 64.0f, 104.0f),
                    PathNode.CurveTo(64.0f, 140.06f, 55.72f, 170.74f, 48.0f, 184.0f),
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
        return _bellSimple!!
    }

private var _bellSimple: ImageVector? = null
