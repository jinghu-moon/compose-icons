package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ContactlessPayment: ImageVector
    get() {
        if (_contactlessPayment != null) return _contactlessPayment!!
        _contactlessPayment = phosphorBoldIcon(
            name = "ContactlessPayment",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152.58 66.35c20.621 38.514 20.621 84.786 0 123.3-1.98 3.853-5.883 6.34-10.211 6.507-4.329 .167-8.411-2.012-10.682-5.702-2.27-3.689-2.376-8.316-.277-12.105 16.836-31.456 16.836-69.244 0-100.7-2.182-3.794-2.124-8.475 .149-12.215 2.274-3.74 6.403-5.945 10.776-5.755 4.373 .19 8.295 2.747 10.235 6.67ZM100.36 77.41c-2.817 1.487-4.927 4.034-5.865 7.078-.938 3.044-.627 6.337 .865 9.152 11.456 21.474 11.456 47.246 0 68.72-2.104 3.792-1.998 8.423 .276 12.115 2.274 3.692 6.363 5.87 10.696 5.697 4.333-.173 8.235-2.67 10.207-6.532 15.211-28.526 15.211-62.754 0-91.28-3.115-5.819-10.343-8.03-16.18-4.95ZM236 128c0 59.647-48.353 108-108 108C68.353 236 20 187.647 20 128 20 68.353 68.353 20 128 20c59.619 .066 107.934 48.381 108 108ZM212 128C212 81.608 174.392 44 128 44 81.608 44 44 81.608 44 128c0 46.392 37.608 84 84 84 46.371-.05 83.95-37.629 84-84Z"),
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
        return _contactlessPayment!!
    }

private var _contactlessPayment: ImageVector? = null
