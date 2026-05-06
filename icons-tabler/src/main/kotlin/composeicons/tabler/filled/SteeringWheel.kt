package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SteeringWheel: ImageVector
    get() {
        if (_steeringWheel != null) return _steeringWheel!!
        _steeringWheel = tablerFilledIcon(
            name = "SteeringWheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.203 2.426 6.057 7.52 4.397 12.081-1.66 4.56-6.354 7.271-11.134 6.428C5.484 21.006 2 16.853 2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34M4 12c0 4.032 3 7.433 7 7.937v-5.107C10.068 14.501 9.358 13.734 9.102 12.78L4.032 11.276q-.031 .36-.032 .725M19.967 11.276l-5.069 1.503c-.256 .954-.965 1.721-1.897 2.051v5.108c4.184-.527 7.241-4.212 6.985-8.422ZM8 5.072C6.355 6.022 5.101 7.526 4.464 9.316l4.812 1.426C9.766 9.679 10.83 8.999 12 8.999c1.17 0 2.234 .68 2.724 1.743L19.536 9.316C18.739 7.079 16.99 5.312 14.762 4.492 12.534 3.673 10.056 3.885 8 5.072"),
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
        return _steeringWheel!!
    }

private var _steeringWheel: ImageVector? = null
