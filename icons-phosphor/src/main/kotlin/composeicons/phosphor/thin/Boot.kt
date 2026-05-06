package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Boot: ImageVector
    get() {
        if (_boot != null) return _boot!!
        _boot = phosphorThinIcon(
            name = "Boot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 116h-36v-60c0-6.627-5.373-12-12-12h-112c-1.316 .002-2.546 .651-3.291 1.735-.745 1.085-.909 2.466-.439 3.695 9.29 24.23 11.46 77.22-.11 117.46-.108 .36-.162 .734-.16 1.11v32c0 6.627 5.373 12 12 12h26.11c1.864-.003 3.702-.438 5.37-1.27l12.62-6.31c.557-.274 1.169-.418 1.79-.42h16.22c.621 .002 1.233 .146 1.79 .42l12.62 6.31c1.668 .832 3.506 1.267 5.37 1.27h28.22c1.864-.003 3.702-.438 5.37-1.27l12.62-6.31c.557-.274 1.169-.418 1.79-.42h16.22c.621 .002 1.233 .146 1.79 .42l12.62 6.31c1.668 .832 3.506 1.267 5.37 1.27h26.11c6.627 0 12-5.373 12-12v-32c-.033-28.705-23.295-51.967-52-52ZM37.6 52h106.4c2.209 0 4 1.791 4 4v28h-36c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h36v24h-36c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h80c22.737 .032 41.715 17.36 43.81 40h-198.61C45.24 131.81 47 82.65 37.6 52ZM236 200c0 2.209-1.791 4-4 4h-26.11c-.621-.002-1.233-.146-1.79-.42l-12.62-6.31c-1.668-.832-3.506-1.267-5.37-1.27h-16.22c-1.864 .003-3.702 .438-5.37 1.27l-12.62 6.31c-.557 .274-1.169 .418-1.79 .42h-28.22c-.621-.002-1.233-.146-1.79-.42l-12.62-6.31c-1.668-.832-3.506-1.267-5.37-1.27h-16.22c-1.864 .003-3.702 .438-5.37 1.27l-12.62 6.31c-.557 .274-1.169 .418-1.79 .42h-26.11c-2.209 0-4-1.791-4-4v-28h200Z"),
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
        return _boot!!
    }

private var _boot: ImageVector? = null
