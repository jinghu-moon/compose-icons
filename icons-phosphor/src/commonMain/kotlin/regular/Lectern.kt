package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Lectern: ImageVector
    get() {
        if (_lectern != null) return _lectern!!
        _lectern = phosphorRegularIcon(
            name = "Lectern",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(246.3f, 120.84f),
                    PathNode.LineTo(206.3f, 40.84f),
                    PathNode.CurveTo(203.60464f, 35.411537f, 198.06076f, 31.984413f, 192.0f, 32.0f),
                    PathNode.LineTo(64.0f, 32.0f),
                    PathNode.CurveTo(57.93923f, 31.984413f, 52.395355f, 35.411537f, 49.7f, 40.84f),
                    PathNode.LineTo(9.7f, 120.84f),
                    PathNode.CurveTo(7.218776f, 125.79848f, 7.481566f, 131.6881f, 10.394537f, 136.40588f),
                    PathNode.CurveTo(13.307509f, 141.12367f, 18.455366f, 143.99704f, 24.0f, 144.0f),
                    PathNode.LineTo(120.0f, 144.0f),
                    PathNode.LineTo(120.0f, 208.0f),
                    PathNode.LineTo(96.0f, 208.0f),
                    PathNode.CurveTo(91.58172f, 208.0f, 88.0f, 211.58173f, 88.0f, 216.0f),
                    PathNode.CurveTo(88.0f, 220.41827f, 91.58172f, 224.0f, 96.0f, 224.0f),
                    PathNode.LineTo(160.0f, 224.0f),
                    PathNode.CurveTo(164.41827f, 224.0f, 168.0f, 220.41827f, 168.0f, 216.0f),
                    PathNode.CurveTo(168.0f, 211.58173f, 164.41827f, 208.0f, 160.0f, 208.0f),
                    PathNode.LineTo(136.0f, 208.0f),
                    PathNode.LineTo(136.0f, 144.0f),
                    PathNode.LineTo(232.0f, 144.0f),
                    PathNode.CurveTo(237.54642f, 144.0005f, 242.69745f, 141.12854f, 245.61284f, 136.41014f),
                    PathNode.CurveTo(248.52821f, 131.69174f, 248.79202f, 125.800064f, 246.31f, 120.84f),
                    PathNode.Close,
                    PathNode.MoveTo(24.0f, 128.0f),
                    PathNode.LineTo(64.0f, 48.0f),
                    PathNode.LineTo(192.0f, 48.0f),
                    PathNode.LineTo(232.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 104.0f),
                    PathNode.CurveTo(192.0f, 108.41828f, 188.41827f, 112.0f, 184.0f, 112.0f),
                    PathNode.LineTo(72.0f, 112.0f),
                    PathNode.CurveTo(67.58172f, 112.0f, 64.0f, 108.41828f, 64.0f, 104.0f),
                    PathNode.CurveTo(64.0f, 99.58172f, 67.58172f, 96.0f, 72.0f, 96.0f),
                    PathNode.LineTo(184.0f, 96.0f),
                    PathNode.CurveTo(188.41827f, 96.0f, 192.0f, 99.58172f, 192.0f, 104.0f),
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
        return _lectern!!
    }

private var _lectern: ImageVector? = null
