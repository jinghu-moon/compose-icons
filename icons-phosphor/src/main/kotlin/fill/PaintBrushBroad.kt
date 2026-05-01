package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PaintBrushBroad: ImageVector
    get() {
        if (_paintBrushBroad != null) return _paintBrushBroad!!
        _paintBrushBroad = phosphorFillIcon(
            name = "PaintBrushBroad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 24.0f),
                    PathNode.LineTo(72.0f, 24.0f),
                    PathNode.CurveTo(49.90861f, 24.0f, 32.0f, 41.90861f, 32.0f, 64.0f),
                    PathNode.LineTo(32.0f, 136.0f),
                    PathNode.CurveTo(32.0f, 149.25484f, 42.745167f, 160.0f, 56.0f, 160.0f),
                    PathNode.LineTo(104.0f, 160.0f),
                    PathNode.LineTo(96.11f, 206.67f),
                    PathNode.CurveTo(96.0382f, 207.10973f, 96.00142f, 207.55446f, 96.0f, 208.0f),
                    PathNode.CurveTo(96.0f, 225.67311f, 110.32689f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(145.67311f, 240.0f, 160.0f, 225.67311f, 160.0f, 208.0f),
                    PathNode.CurveTo(159.99858f, 207.55446f, 159.96179f, 207.10973f, 159.89f, 206.67f),
                    PathNode.LineTo(152.0f, 160.0f),
                    PathNode.LineTo(200.0f, 160.0f),
                    PathNode.CurveTo(213.25484f, 160.0f, 224.0f, 149.25484f, 224.0f, 136.0f),
                    PathNode.LineTo(224.0f, 32.0f),
                    PathNode.CurveTo(224.0f, 27.581722f, 220.41827f, 24.0f, 216.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 40.0f),
                    PathNode.LineTo(176.0f, 40.0f),
                    PathNode.LineTo(176.0f, 80.0f),
                    PathNode.CurveTo(176.0f, 84.41828f, 179.58173f, 88.0f, 184.0f, 88.0f),
                    PathNode.CurveTo(188.41827f, 88.0f, 192.0f, 84.41828f, 192.0f, 80.0f),
                    PathNode.LineTo(192.0f, 40.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.LineTo(208.0f, 112.0f),
                    PathNode.LineTo(48.0f, 112.0f),
                    PathNode.LineTo(48.0f, 64.0f),
                    PathNode.CurveTo(48.0f, 50.745167f, 58.745167f, 40.0f, 72.0f, 40.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _paintBrushBroad!!
    }

private var _paintBrushBroad: ImageVector? = null
