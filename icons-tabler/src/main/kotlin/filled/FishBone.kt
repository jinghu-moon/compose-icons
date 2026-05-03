package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FishBone: ImageVector
    get() {
        if (_fishBone != null) return _fishBone!!
        _fishBone = tablerFilledIcon(
            name = "FishBone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.675 6.440 L 16.793 6.445 C 16.872 6.453 16.950 6.471 17.025 6.497 L 17.057 6.512 L 17.330 6.615 C 19.266 7.386 21.020 8.885 22.583 11.091 L 22.828 11.446 C 23.057 11.784 23.057 12.228 22.828 12.566 C 21.126 15.085 19.192 16.742 17.036 17.513 C 16.647 17.652 16.213 17.537 15.943 17.225 C 14.911 16.034 14.256 14.564 14.060 13.000 L 12.000 13.000 L 12.000 16.000 C 12.000 16.552 11.552 17.000 11.000 17.000 C 10.448 17.000 10.000 16.552 10.000 16.000 L 10.000 13.000 L 8.000 13.000 L 8.000 14.000 C 8.000 14.552 7.552 15.000 7.000 15.000 C 6.448 15.000 6.000 14.552 6.000 14.000 L 6.000 13.000 L 4.834 13.000 L 4.499 13.324 C 3.895 13.920 3.311 14.536 2.748 15.170 C 2.381 15.583 1.749 15.621 1.336 15.254 C 0.923 14.887 0.885 14.255 1.252 13.842 Q 1.845 13.175 2.466 12.534 L 2.988 12.006 L 2.465 11.477 C 2.258 11.263 2.054 11.047 1.852 10.829 L 1.252 10.168 C 0.885 9.755 0.923 9.123 1.336 8.756 C 1.749 8.389 2.381 8.427 2.748 8.840 C 3.410 9.586 4.101 10.307 4.817 11.001 L 6.000 11.000 L 6.000 10.000 C 6.000 9.448 6.448 9.000 7.000 9.000 C 7.552 9.000 8.000 9.448 8.000 10.000 L 8.000 11.000 L 10.000 11.000 L 10.000 8.000 C 10.000 7.448 10.448 7.000 11.000 7.000 C 11.552 7.000 12.000 7.448 12.000 8.000 L 12.000 11.000 L 14.062 11.000 C 14.243 9.556 14.815 8.189 15.718 7.047 L 15.914 6.807 L 15.989 6.726 L 16.094 6.638 L 16.162 6.590 L 16.259 6.538 L 16.328 6.508 L 16.466 6.466 L 16.557 6.449 Q 16.616 6.442 16.675 6.440M 18.000 10.000 C 17.493 10.000 17.066 10.380 17.007 10.883 L 17.000 11.010 C 17.001 11.539 17.413 11.976 17.941 12.007 C 18.470 12.038 18.931 11.652 18.993 11.127 L 19.000 11.000 C 19.000 10.448 18.552 10.000 18.000 10.000"),
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
        return _fishBone!!
    }

private var _fishBone: ImageVector? = null
