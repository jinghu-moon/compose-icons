package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MarkerCircle: ImageVector
    get() {
        if (_markerCircle != null) return _markerCircle!!
        _markerCircle = phosphorThinIcon(
            name = "MarkerCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M198.71 57.29C173.485 31.843 136.573 21.837 101.949 31.06 67.326 40.283 40.283 67.326 31.06 101.949c-9.223 34.623 .783 71.535 26.23 96.761 25.225 25.447 62.137 35.453 96.761 26.23 34.623-9.223 61.666-36.266 70.889-70.889 9.223-34.623-.783-71.535-26.23-96.761ZM84 208.83v-32.83c0-2.209 1.791-4 4-4h80c2.209 0 4 1.791 4 4v32.83c-27.443 14.893-60.557 14.893-88 0ZM108.15 140h43.85c2.209 0 4 1.791 4 4v20h-56v-20c0-2.209 1.791-4 4-4ZM113.08 132l11-52.82c.379-1.864 2.018-3.204 3.92-3.204 1.902 0 3.541 1.34 3.92 3.204l11 52.82ZM193.08 193.05c-4.017 4.011-8.396 7.643-13.08 10.85v-27.9c0-6.627-5.373-12-12-12h-4v-20c0-6.627-5.373-12-12-12h-.91L139.75 77.55C138.595 71.98 133.688 67.987 128 67.987c-5.688 0-10.595 3.994-11.75 9.563L104.91 132h-.91c-6.627 0-12 5.373-12 12v20h-4c-6.627 0-12 5.373-12 12v27.9c-4.656-3.211-9.008-6.843-13-10.85C36.686 166.739 28.813 127.167 43.052 92.788 57.291 58.409 90.838 35.992 128.05 35.992c37.212 0 70.759 22.416 84.998 56.796 14.239 34.379 6.366 73.951-19.948 100.262Z"),
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
        return _markerCircle!!
    }

private var _markerCircle: ImageVector? = null
