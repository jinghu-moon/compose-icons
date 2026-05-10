package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ThreadsFill: ImageVector
    get() {
        if (_threadsFill != null) return _threadsFill!!
        _threadsFill = remixIcon(
            name = "ThreadsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.705 11.108C16.543 8.121 14.911 6.411 12.171 6.394 10.519 6.384 9.138 7.084 8.292 8.367L9.799 9.4c.634-.962 1.635-1.16 2.36-1.154 .902 .006 1.583 .268 2.024 .78 .321 .372 .535 .887 .641 1.537-.8-.136-1.665-.178-2.59-.125-2.605 .15-4.28 1.67-4.168 3.781 .057 1.071 .591 1.992 1.502 2.594 .771 .509 1.764 .758 2.795 .701 1.363-.075 2.432-.594 3.177-1.545 .566-.722 .925-1.657 1.083-2.836 .649 .392 1.131 .908 1.396 1.528 .452 1.054 .478 2.786-.935 4.197-1.238 1.237-2.726 1.772-4.975 1.788C9.616 20.629 7.729 19.829 6.503 18.269 5.354 16.809 4.76 14.7 4.738 12 4.76 9.3 5.354 7.191 6.503 5.731 7.729 4.171 9.616 3.371 12.111 3.353c2.513 .019 4.433 .823 5.706 2.39 .625 .768 1.095 1.735 1.406 2.861l1.766-.471C20.612 6.746 20.021 5.551 19.215 4.56 17.582 2.551 15.182 1.521 12.105 1.5 9.034 1.521 6.673 2.555 5.086 4.571 3.675 6.366 2.946 8.877 2.922 12.007c.024 3.13 .753 5.627 2.164 7.422 1.586 2.017 3.96 3.05 7.031 3.071 2.73-.019 4.654-.734 6.24-2.317 2.074-2.072 2.012-4.67 1.328-6.264-.525-1.224-1.571-2.206-2.98-2.81ZM12.267 15.665c-1.142 .064-2.328-.448-2.387-1.546-.043-.814 .579-1.722 2.457-1.83 .923-.053 1.777 .009 2.533 .175-.216 2.702-1.485 3.141-2.603 3.202Z"),
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
        return _threadsFill!!
    }

private var _threadsFill: ImageVector? = null
