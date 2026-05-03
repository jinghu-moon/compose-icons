package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CodeCircle2: ImageVector
    get() {
        if (_codeCircle2 != null) return _codeCircle2!!
        _codeCircle2 = tablerFilledIcon(
            name = "CodeCircle2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 3.340 C 21.203 5.766 23.057 10.860 21.397 15.421 C 19.737 19.981 15.043 22.691 10.263 21.848 C 5.484 21.006 2.000 16.853 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340M 13.342 8.560 C 13.093 8.469 12.818 8.481 12.577 8.593 C 12.337 8.706 12.151 8.909 12.060 9.158 L 10.060 14.658 C 9.871 15.177 10.139 15.751 10.658 15.940 C 11.177 16.129 11.751 15.861 11.940 15.342 L 13.940 9.842 C 14.031 9.593 14.019 9.318 13.907 9.077 C 13.794 8.837 13.591 8.651 13.342 8.560M 9.207 9.793 C 8.816 9.403 8.184 9.403 7.793 9.793 L 6.293 11.293 C 5.903 11.684 5.903 12.316 6.293 12.707 L 7.793 14.207 C 8.184 14.597 8.816 14.597 9.207 14.207 L 9.290 14.113 C 9.599 13.715 9.563 13.149 9.207 12.793 L 8.415 12.000 L 9.207 11.207 C 9.597 10.816 9.597 10.184 9.207 9.793M 16.207 9.793 C 15.816 9.403 15.184 9.403 14.793 9.793 L 14.710 9.887 C 14.401 10.285 14.437 10.851 14.793 11.207 L 15.585 12.000 L 14.793 12.793 C 14.414 13.185 14.419 13.809 14.805 14.195 C 15.191 14.581 15.815 14.586 16.207 14.207 L 17.707 12.707 C 18.097 12.316 18.097 11.684 17.707 11.293 Z"),
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
        return _codeCircle2!!
    }

private var _codeCircle2: ImageVector? = null
