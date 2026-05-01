package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PicnicTable: ImageVector
    get() {
        if (_picnicTable != null) return _picnicTable!!
        _picnicTable = phosphorDuotoneIcon(
            name = "PicnicTable",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 192.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.LineTo(96.0f, 64.0f),
                    PathNode.LineTo(160.0f, 64.0f),
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
                    PathNode.MoveTo(248.0f, 128.0f),
                    PathNode.LineTo(200.94f, 128.0f),
                    PathNode.LineTo(172.94f, 72.0f),
                    PathNode.LineTo(192.0f, 72.0f),
                    PathNode.CurveTo(196.41827f, 72.0f, 200.0f, 68.41828f, 200.0f, 64.0f),
                    PathNode.CurveTo(200.0f, 59.581722f, 196.41827f, 56.0f, 192.0f, 56.0f),
                    PathNode.LineTo(64.0f, 56.0f),
                    PathNode.CurveTo(59.581722f, 56.0f, 56.0f, 59.581722f, 56.0f, 64.0f),
                    PathNode.CurveTo(56.0f, 68.41828f, 59.581722f, 72.0f, 64.0f, 72.0f),
                    PathNode.LineTo(83.06f, 72.0f),
                    PathNode.LineTo(55.06f, 128.0f),
                    PathNode.LineTo(8.0f, 128.0f),
                    PathNode.CurveTo(3.581722f, 128.0f, 0f, 131.58173f, 0f, 136.0f),
                    PathNode.CurveTo(0f, 140.41827f, 3.581722f, 144.0f, 8.0f, 144.0f),
                    PathNode.LineTo(47.06f, 144.0f),
                    PathNode.LineTo(24.84f, 188.42f),
                    PathNode.CurveTo(22.866526f, 192.37166f, 24.469118f, 197.17496f, 28.42f, 199.15f),
                    PathNode.CurveTo(29.529797f, 199.71117f, 30.756397f, 200.0024f, 32.0f, 200.0f),
                    PathNode.CurveTo(35.034916f, 200.00597f, 37.81188f, 198.29408f, 39.17f, 195.58f),
                    PathNode.LineTo(64.94f, 144.0f),
                    PathNode.LineTo(191.06f, 144.0f),
                    PathNode.LineTo(216.84f, 195.58f),
                    PathNode.CurveTo(218.19652f, 198.29086f, 220.96869f, 200.00217f, 224.0f, 200.0f),
                    PathNode.CurveTo(225.24022f, 200.00081f, 226.46321f, 199.70964f, 227.57f, 199.15f),
                    PathNode.CurveTo(231.52089f, 197.17496f, 233.12347f, 192.37166f, 231.15f, 188.42f),
                    PathNode.LineTo(208.94f, 144.0f),
                    PathNode.LineTo(248.0f, 144.0f),
                    PathNode.CurveTo(252.41827f, 144.0f, 256.0f, 140.41827f, 256.0f, 136.0f),
                    PathNode.CurveTo(256.0f, 131.58173f, 252.41827f, 128.0f, 248.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.94f, 128.0f),
                    PathNode.LineTo(100.94f, 72.0f),
                    PathNode.LineTo(155.06f, 72.0f),
                    PathNode.LineTo(183.06f, 128.0f),
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
        return _picnicTable!!
    }

private var _picnicTable: ImageVector? = null
