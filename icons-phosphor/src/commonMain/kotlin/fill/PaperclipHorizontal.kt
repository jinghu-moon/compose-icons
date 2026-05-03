package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PaperclipHorizontal: ImageVector
    get() {
        if (_paperclipHorizontal != null) return _paperclipHorizontal!!
        _paperclipHorizontal = phosphorFillIcon(
            name = "PaperclipHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 168.0f),
                    PathNode.LineTo(72.0f, 168.0f),
                    PathNode.CurveTo(58.745167f, 168.0f, 48.0f, 157.25484f, 48.0f, 144.0f),
                    PathNode.CurveTo(48.0f, 130.74516f, 58.745167f, 120.0f, 72.0f, 120.0f),
                    PathNode.LineTo(168.0f, 120.0f),
                    PathNode.CurveTo(172.41827f, 120.0f, 176.0f, 123.58172f, 176.0f, 128.0f),
                    PathNode.CurveTo(176.0f, 132.41827f, 172.41827f, 136.0f, 168.0f, 136.0f),
                    PathNode.LineTo(72.0f, 136.0f),
                    PathNode.CurveTo(67.58172f, 136.0f, 64.0f, 139.58173f, 64.0f, 144.0f),
                    PathNode.CurveTo(64.0f, 148.41827f, 67.58172f, 152.0f, 72.0f, 152.0f),
                    PathNode.LineTo(168.0f, 152.0f),
                    PathNode.CurveTo(181.25484f, 152.0f, 192.0f, 141.25484f, 192.0f, 128.0f),
                    PathNode.CurveTo(192.0f, 114.74516f, 181.25484f, 104.0f, 168.0f, 104.0f),
                    PathNode.LineTo(96.0f, 104.0f),
                    PathNode.CurveTo(91.58172f, 104.0f, 88.0f, 100.41828f, 88.0f, 96.0f),
                    PathNode.CurveTo(88.0f, 91.58172f, 91.58172f, 88.0f, 96.0f, 88.0f),
                    PathNode.LineTo(168.0f, 88.0f),
                    PathNode.CurveTo(190.09138f, 88.0f, 208.0f, 105.90861f, 208.0f, 128.0f),
                    PathNode.CurveTo(208.0f, 150.09138f, 190.09138f, 168.0f, 168.0f, 168.0f),
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
        return _paperclipHorizontal!!
    }

private var _paperclipHorizontal: ImageVector? = null
