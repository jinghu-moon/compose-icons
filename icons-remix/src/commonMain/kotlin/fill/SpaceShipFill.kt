package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SpaceShipFill: ImageVector
    get() {
        if (_spaceShipFill != null) return _spaceShipFill!!
        _spaceShipFill = remixIcon(
            name = "SpaceShipFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.880 18.049 C 4.230 12.056 7.075 6.628 11.003 2.180 C 11.111 2.058 11.247 1.907 11.411 1.729 L 11.411 1.728 C 11.710 1.403 12.216 1.382 12.541 1.681 C 12.558 1.696 12.574 1.712 12.589 1.729 C 12.755 1.910 12.893 2.062 13.002 2.185 C 16.927 6.633 19.770 12.058 21.120 18.049 C 18.979 18.500 16.780 18.796 14.536 18.924 L 12.447 23.101 C 12.324 23.348 12.023 23.448 11.776 23.325 C 11.680 23.276 11.601 23.198 11.553 23.101 L 9.464 18.924 C 7.220 18.796 5.021 18.500 2.880 18.049 ZM 12.000 14.995 C 13.657 14.995 15.000 13.652 15.000 11.995 C 15.000 10.339 13.657 8.995 12.000 8.995 C 10.343 8.995 9.000 10.339 9.000 11.995 C 9.000 13.652 10.343 14.995 12.000 14.995 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _spaceShipFill!!
    }

private var _spaceShipFill: ImageVector? = null
