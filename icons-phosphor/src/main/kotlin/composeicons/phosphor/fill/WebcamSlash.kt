package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WebcamSlash: ImageVector
    get() {
        if (_webcamSlash != null) return _webcamSlash!!
        _webcamSlash = phosphorFillIcon(
            name = "WebcamSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M83.34 43.19c-.773-.867-1.131-2.027-.982-3.178 .15-1.152 .793-2.181 1.762-2.822C116.995 15.808 160.523 21.409 186.914 50.417c26.391 29.008 27.863 72.87 3.476 103.583-.727 .927-1.826 1.487-3.004 1.529-1.178 .042-2.314-.437-3.106-1.309L167.85 136.14c-1.26-1.39-1.385-3.469-.3-5 12.558-18.357 10.86-42.938-4.103-59.394C148.484 55.29 124.175 51.269 104.71 62.03c-1.626 .928-3.679 .604-4.94-.78ZM126.93 72c-2.861 .092-5.697 .569-8.43 1.42-1.328 .4-2.354 1.461-2.711 2.802-.357 1.341 .007 2.771 .961 3.778l34.12 37.53c.924 1.019 2.306 1.493 3.661 1.253 1.355-.24 2.491-1.159 3.009-2.433 1.634-3.912 2.47-8.111 2.46-12.35-.094-8.644-3.643-16.891-9.855-22.903C143.932 75.086 135.573 71.81 126.93 72ZM213.38 221.9c-3.27 2.971-8.329 2.729-11.3-.54L197.19 216h-165.19c-2.217 .005-4.336-.91-5.853-2.527C24.631 211.856 23.853 209.682 24 207.47c.367-4.275 3.979-7.538 8.27-7.47h87.73v-16.4C92.939 180.902 69.107 164.629 56.742 140.408 44.376 116.187 45.174 87.34 58.86 63.84L42.08 45.38C40.117 43.271 39.439 40.27 40.306 37.522c.867-2.748 3.144-4.817 5.961-5.418 2.818-.601 5.741 .36 7.653 2.515l160 176c2.971 3.27 2.729 8.329-.54 11.3ZM128 152c3.361-.003 6.713-.359 10-1.06L124.21 135.77C108.384 133.886 96.356 120.644 96 104.71L82.23 89.55c-4.604 14.584-1.983 30.489 7.058 42.825C98.329 144.71 112.706 151.999 128 152ZM182.64 200 161.42 176.66c-8.027 3.716-16.619 6.062-25.42 6.94v16.4Z"),
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
        return _webcamSlash!!
    }

private var _webcamSlash: ImageVector? = null
