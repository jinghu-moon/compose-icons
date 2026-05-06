package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MetaLine: ImageVector
    get() {
        if (_metaLine != null) return _metaLine!!
        _metaLine = remixIcon(
            name = "MetaLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.974 16.163c-.286 .891-.775 1.337-1.47 1.337-.878 0-1.74-.527-2.588-1.579-.589-.731-1.414-2.121-2.477-4.169-.456-.879-.879-1.656-1.269-2.329 .309-.489 .586-.88 .828-1.176 .957-1.164 1.959-1.746 3.005-1.746 .835 0 1.63 .536 2.386 1.608 .777 1.101 1.321 2.462 1.632 4.081 .306 1.593 .29 2.918-.048 3.975ZM12.005 11.43c.21 .385 .43 .8 .66 1.243 1.124 2.167 2.022 3.667 2.694 4.502 1.248 1.55 2.63 2.325 4.146 2.325 .856 0 1.588-.27 2.197-.811 .525-.466 .917-1.104 1.177-1.915 .443-1.381 .479-3.035 .108-4.963C22.621 9.91 21.967 8.291 21.025 6.955 19.871 5.318 18.531 4.5 17.005 4.5c-1.676 0-3.193 .825-4.55 2.476-.142 .172-.292 .37-.45 .594-.158-.224-.308-.422-.45-.594C10.198 5.325 8.681 4.5 7.005 4.5c-1.526 0-2.866 .818-4.02 2.455C2.043 8.291 1.389 9.91 1.023 11.811c-.371 1.928-.335 3.582 .108 4.963 .26 .811 .652 1.449 1.177 1.915 .609 .541 1.341 .811 2.197 .811 1.516 0 2.898-.775 4.146-2.325 .672-.835 1.57-2.336 2.694-4.502 .23-.443 .45-.858 .66-1.243ZM10.838 9.422c-.39 .674-.813 1.45-1.269 2.329C8.507 13.8 7.681 15.189 7.093 15.921c-.848 1.053-1.71 1.579-2.588 1.579-.694 0-1.184-.445-1.47-1.337C2.697 15.107 2.681 13.782 2.987 12.189 3.298 10.569 3.842 9.209 4.619 8.108 5.375 7.036 6.17 6.5 7.005 6.5c1.046 0 2.048 .582 3.005 1.746 .243 .295 .519 .687 .828 1.176Z"),
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
        return _metaLine!!
    }

private var _metaLine: ImageVector? = null
