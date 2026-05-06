package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Hash: ImageVector
    get() {
        if (_hash != null) return _hash!!
        _hash = phosphorBoldIcon(
            name = "Hash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 84h-43.8l7.61-41.85c1.187-6.522-3.138-12.773-9.66-13.96-6.522-1.187-12.773 3.138-13.96 9.66L155.8 84h-39.6l7.61-41.85c1.187-6.522-3.138-12.773-9.66-13.96-6.522-1.187-12.773 3.138-13.96 9.66L91.8 84h-43.8C41.373 84 36 89.373 36 96c0 6.627 5.373 12 12 12h39.44l-7.27 40h-48.17c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h43.8l-7.61 41.85c-.583 3.138 .108 6.38 1.921 9.007 1.813 2.627 4.598 4.424 7.739 4.993 .71 .118 1.43 .168 2.15 .15 5.799-.004 10.766-4.154 11.8-9.86L100.2 172h39.6l-7.61 41.85c-.583 3.138 .108 6.38 1.921 9.007 1.813 2.627 4.598 4.424 7.739 4.993 .712 .135 1.435 .202 2.16 .2 5.799-.004 10.766-4.154 11.8-9.86L164.2 172h43.8c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-39.44l7.27-40h48.17c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM144.17 148h-39.61l7.27-40h39.61Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _hash!!
    }

private var _hash: ImageVector? = null
