package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SpaceShipLine: ImageVector
    get() {
        if (_spaceShipLine != null) return _spaceShipLine!!
        _spaceShipLine = remixIcon(
            name = "SpaceShipLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.880 18.049 C 4.230 12.056 7.075 6.629 11.003 2.180 C 11.111 2.058 11.247 1.907 11.411 1.729 C 11.710 1.403 12.216 1.382 12.541 1.681 C 12.558 1.696 12.574 1.712 12.589 1.729 C 12.755 1.910 12.893 2.062 13.002 2.185 C 16.927 6.633 19.770 12.058 21.120 18.049 C 18.979 18.500 16.780 18.796 14.536 18.924 L 12.447 23.101 C 12.324 23.348 12.023 23.448 11.776 23.325 C 11.680 23.276 11.601 23.198 11.553 23.101 L 9.464 18.924 C 7.220 18.796 5.021 18.500 2.880 18.049 ZM 9.577 16.927 L 10.735 16.993 L 12.000 19.523 L 13.265 16.993 L 14.422 16.927 C 15.844 16.846 17.254 16.694 18.649 16.472 C 17.323 11.919 15.054 7.705 12.000 4.085 C 8.946 7.705 6.677 11.919 5.351 16.472 C 6.746 16.694 8.156 16.846 9.577 16.927 ZM 12.000 14.995 C 10.343 14.995 9.000 13.652 9.000 11.995 C 9.000 10.339 10.343 8.995 12.000 8.995 C 13.657 8.995 15.000 10.339 15.000 11.995 C 15.000 13.652 13.657 14.995 12.000 14.995 ZM 12.000 12.995 C 12.552 12.995 13.000 12.548 13.000 11.995 C 13.000 11.443 12.552 10.995 12.000 10.995 C 11.448 10.995 11.000 11.443 11.000 11.995 C 11.000 12.548 11.448 12.995 12.000 12.995 Z"),
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
        return _spaceShipLine!!
    }

private var _spaceShipLine: ImageVector? = null
