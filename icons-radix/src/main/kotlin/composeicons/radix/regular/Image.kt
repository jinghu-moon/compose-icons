package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Image: ImageVector
    get() {
        if (_image != null) return _image!!
        _image = radixIcon(
            name = "Image",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.5 1C13.328 1 14 1.672 14 2.5v10C14 13.328 13.328 14 12.5 14h-10C1.723 14 1.085 13.41 1.008 12.653L1 12.5v-10C1 1.672 1.672 1 2.5 1h10ZM2 9.636v2.864l.01 .101c.04 .195 .194 .35 .39 .39L2.5 13h6.441L7.528 11.439v-.001L3.988 7.647 2 9.636ZM8.483 11.152 10.155 13h2.345l.101-.01c.195-.04 .35-.194 .39-.39L13 12.5v-1.863L11 8.637 8.483 11.152ZM2.399 2.01C2.171 2.056 2 2.258 2 2.5v5.863L3.682 6.682l.07-.057c.075-.05 .164-.077 .256-.075 .122 .002 .238 .054 .321 .144l3.544 3.796L10.682 7.682l.07-.058c.175-.116 .413-.096 .566 .058L13 9.363v-6.863c0-.242-.171-.444-.399-.49L12.5 2h-10l-.101 .01ZM7.5 3.749c.967 0 1.751 .784 1.751 1.751 0 .967-.784 1.751-1.751 1.751C6.533 7.251 5.749 6.467 5.749 5.5c0-.967 .784-1.751 1.751-1.751ZM7.5 4.649c-.47 0-.851 .381-.851 .851 0 .47 .381 .851 .851 .851 .47 0 .851-.381 .851-.851 0-.47-.381-.851-.851-.851Z"),
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
        return _image!!
    }

private var _image: ImageVector? = null
