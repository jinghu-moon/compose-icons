package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCake: ImageVector
    get() {
        if (_brandCake != null) return _brandCake!!
        _brandCake = tablerOutlineIcon(
            name = "BrandCake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.840 12.000 C 20.840 14.050 21.825 15.225 20.800 17.000 C 19.774 18.775 18.263 18.510 16.486 19.534 C 14.710 20.560 14.184 22.000 12.133 22.000 C 10.082 22.000 9.557 20.559 7.780 19.534 C 6.004 18.510 4.492 18.775 3.466 17.000 C 2.441 15.225 3.426 14.050 3.426 12.000 C 3.426 9.950 2.441 8.775 3.466 7.000 C 4.492 5.225 6.003 5.490 7.780 4.466 C 9.556 3.440 10.082 2.000 12.133 2.000 C 14.184 2.000 14.710 3.441 16.486 4.466 C 18.262 5.490 19.774 5.225 20.799 7.000 C 21.825 8.775 20.839 9.950 20.839 12.000 L 20.840 12.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _brandCake!!
    }

private var _brandCake: ImageVector? = null
