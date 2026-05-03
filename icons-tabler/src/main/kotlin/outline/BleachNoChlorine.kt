package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BleachNoChlorine: ImageVector
    get() {
        if (_bleachNoChlorine != null) return _bleachNoChlorine!!
        _bleachNoChlorine = tablerOutlineIcon(
            name = "BleachNoChlorine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.000 19.000 L 19.000 19.000 C 19.663 18.995 20.280 18.663 20.648 18.112 C 21.017 17.562 21.088 16.864 20.840 16.250 L 13.740 4.000 C 13.388 3.363 12.718 2.968 11.990 2.968 C 11.262 2.968 10.592 3.363 10.240 4.000 L 3.140 16.250 C 2.896 16.850 2.958 17.530 3.306 18.076 C 3.653 18.623 4.244 18.967 4.890 19.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 6.576 19.000 L 14.483 5.267"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 11.719 19.014 L 17.065 9.730"),
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
        return _bleachNoChlorine!!
    }

private var _bleachNoChlorine: ImageVector? = null
