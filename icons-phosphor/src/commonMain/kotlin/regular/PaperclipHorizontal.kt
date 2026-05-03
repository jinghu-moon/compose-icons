package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PaperclipHorizontal: ImageVector
    get() {
        if (_paperclipHorizontal != null) return _paperclipHorizontal!!
        _paperclipHorizontal = phosphorRegularIcon(
            name = "PaperclipHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 128.0f),
                    PathNode.CurveTo(247.96693f, 158.91423f, 222.91423f, 183.96693f, 192.0f, 184.0f),
                    PathNode.LineTo(48.0f, 184.0f),
                    PathNode.CurveTo(25.90861f, 184.0f, 8.0f, 166.09138f, 8.0f, 144.0f),
                    PathNode.CurveTo(8.0f, 121.90861f, 25.90861f, 104.0f, 48.0f, 104.0f),
                    PathNode.LineTo(192.0f, 104.0f),
                    PathNode.CurveTo(205.25484f, 104.0f, 216.0f, 114.74516f, 216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 141.25484f, 205.25484f, 152.0f, 192.0f, 152.0f),
                    PathNode.LineTo(80.0f, 152.0f),
                    PathNode.CurveTo(75.58172f, 152.0f, 72.0f, 148.41827f, 72.0f, 144.0f),
                    PathNode.CurveTo(72.0f, 139.58173f, 75.58172f, 136.0f, 80.0f, 136.0f),
                    PathNode.LineTo(192.0f, 136.0f),
                    PathNode.CurveTo(196.41827f, 136.0f, 200.0f, 132.41827f, 200.0f, 128.0f),
                    PathNode.CurveTo(200.0f, 123.58172f, 196.41827f, 120.0f, 192.0f, 120.0f),
                    PathNode.LineTo(48.0f, 120.0f),
                    PathNode.CurveTo(34.745167f, 120.0f, 24.0f, 130.74516f, 24.0f, 144.0f),
                    PathNode.CurveTo(24.0f, 157.25484f, 34.745167f, 168.0f, 48.0f, 168.0f),
                    PathNode.LineTo(192.0f, 168.0f),
                    PathNode.CurveTo(214.09138f, 168.0f, 232.0f, 150.09138f, 232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 105.90861f, 214.09138f, 88.0f, 192.0f, 88.0f),
                    PathNode.LineTo(80.0f, 88.0f),
                    PathNode.CurveTo(75.58172f, 88.0f, 72.0f, 84.41828f, 72.0f, 80.0f),
                    PathNode.CurveTo(72.0f, 75.58172f, 75.58172f, 72.0f, 80.0f, 72.0f),
                    PathNode.LineTo(192.0f, 72.0f),
                    PathNode.CurveTo(222.91423f, 72.033066f, 247.96693f, 97.08576f, 248.0f, 128.0f),
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
        return _paperclipHorizontal!!
    }

private var _paperclipHorizontal: ImageVector? = null
