package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Tabs: ImageVector
    get() {
        if (_tabs != null) return _tabs!!
        _tabs = phosphorBoldIcon(
            name = "Tabs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M255.49 164.55h0v-.06c.005-.03 .005-.06 0-.09L233.2 90.25C230.699 81.768 222.893 75.959 214.05 76h-10.05c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h7.07l16.8 56h-30.94L177.2 90.25C174.699 81.768 166.893 75.959 158.05 76h-10.05c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h7.07l16.8 56h-30.94L121.2 90.25C118.699 81.768 110.893 75.959 102.05 76h-60.05C33.138 75.937 25.306 81.75 22.8 90.25L.55 164.4c-.005 .03-.005 .06 0 .09v.06c-.065 .203-.118 .41-.16 .62-.866 3.568-.051 7.336 2.213 10.227 2.263 2.891 5.726 4.587 9.397 4.603h232c3.793-.001 7.362-1.795 9.626-4.839 2.264-3.044 2.955-6.978 1.864-10.611ZM44.93 100h54.14l16.8 56h-87.74Z"),
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
        return _tabs!!
    }

private var _tabs: ImageVector? = null
