package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Tabs: ImageVector
    get() {
        if (_tabs != null) return _tabs!!
        _tabs = phosphorThinIcon(
            name = "Tabs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M251.81 166.86h0L229.52 92.56C228.026 87.473 223.351 83.985 218.05 84h-10.05c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h10.05c1.766 0 3.322 1.159 3.83 2.85L242.62 164h-39.62L181.54 92.55C180.04 87.46 175.356 83.975 170.05 84h-10.05c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h10.05c1.766 0 3.322 1.159 3.83 2.85L194.62 164h-39.62L133.54 92.55C132.04 87.46 127.356 83.975 122.05 84h-84.05c-5.306-.025-9.99 3.46-11.49 8.55L4.17 166.85c0 .06 0 .12 0 .17-.3 1.188-.04 2.448 .707 3.419 .747 .971 1.898 1.546 3.123 1.561h240c2.209 0 4-1.791 4-4-.006-.387-.07-.772-.19-1.14ZM34.12 94.86C34.629 93.147 36.213 91.98 38 92h84.1c1.766 0 3.322 1.159 3.83 2.85L146.62 164h-133.24Z"),
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
