package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Graph: ImageVector
    get() {
        if (_graph != null) return _graph!!
        _graph = phosphorThinIcon(
            name = "Graph",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 156c-7.239-.006-14.197 2.806-19.4 7.84l-28.28-22c2.415-4.212 3.684-8.984 3.68-13.84-0-1.677-.151-3.35-.45-5L175 116.55c6.603 13.162 22.254 18.984 35.854 13.337 13.6-5.647 20.524-20.843 15.862-34.811C222.054 81.108 207.39 73.118 193.125 76.771c-14.265 3.654-23.282 17.709-20.655 32.199L153 115.45C148.256 105.989 138.584 100.011 128 100c-2.57-.001-5.128 .356-7.6 1.06L110.9 79.69c11.803-7.437 16.332-22.428 10.619-35.156C115.806 31.807 101.595 25.226 88.194 29.103 74.792 32.979 66.289 46.13 68.253 59.942 70.217 73.754 82.049 84.013 96 84c2.57 .001 5.128-.356 7.6-1.06l9.5 21.37c-6.38 4.001-10.875 10.407-12.467 17.768-1.593 7.36-.148 15.052 4.007 21.332L74 170.61c-11.215-9.479-27.847-8.684-38.107 1.822-10.26 10.505-10.66 27.152-.918 38.139 9.742 10.987 26.317 12.582 37.975 3.654 11.658-8.928 14.439-25.346 6.37-37.615l30.6-27.2c10.944 9.265 27.128 8.734 37.44-1.23l28.28 22c-6.245 11.004-4.334 24.829 4.662 33.727 8.996 8.898 22.841 10.657 33.776 4.292 10.935-6.365 16.243-19.273 12.948-31.49C223.731 164.493 212.653 156.004 200 156ZM200 84c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20ZM76 56C76 44.954 84.954 36 96 36c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20C84.954 76 76 67.046 76 56ZM56 212C44.954 212 36 203.046 36 192c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM128 148c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM200 204c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20Z"),
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
        return _graph!!
    }

private var _graph: ImageVector? = null
