package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Dumpling: ImageVector
    get() {
        if (_dumpling != null) return _dumpling!!
        _dumpling = tablerOutlineIcon(
            name = "Dumpling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.532 5.532 C 6.201 4.861 7.189 4.621 8.092 4.909 C 8.341 3.925 9.154 3.185 10.157 3.028 C 11.160 2.872 12.159 3.330 12.696 4.192 Q 12.842 3.952 13.052 3.742 C 13.756 3.037 14.809 2.811 15.740 3.165 C 16.672 3.518 17.310 4.384 17.370 5.379 C 18.332 4.938 19.466 5.142 20.214 5.890 L 20.572 6.248 C 21.956 7.633 19.872 11.961 15.917 15.917 C 11.961 19.872 7.633 21.957 6.248 20.572 L 5.890 20.214 L 5.776 20.092 C 5.118 19.342 4.962 18.275 5.378 17.368 C 4.279 17.301 3.349 16.531 3.079 15.463 C 2.808 14.396 3.258 13.276 4.192 12.693 C 3.331 12.156 2.874 11.157 3.030 10.154 C 3.186 9.152 3.926 8.339 4.910 8.090 C 4.622 7.188 4.862 6.201 5.532 5.532"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _dumpling!!
    }

private var _dumpling: ImageVector? = null
