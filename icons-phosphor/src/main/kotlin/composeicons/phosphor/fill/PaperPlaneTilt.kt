package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PaperPlaneTilt: ImageVector
    get() {
        if (_paperPlaneTilt != null) return _paperPlaneTilt!!
        _paperPlaneTilt = phosphorFillIcon(
            name = "PaperPlaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M231.4 44.34c0 0 0 .1 0 .15L173.2 236.43c-1.804 6.385-7.387 10.975-14 11.51q-.69 .06-1.38 .06c-6.179 .019-11.806-3.552-14.42-9.15L107 164.15c-.747-1.535-.437-3.374 .77-4.58l57.92-57.92c2.988-3.145 2.925-8.099-.143-11.167-3.068-3.068-8.022-3.131-11.167-.143L96.43 148.26c-1.206 1.207-3.045 1.517-4.58 .77L17.08 112.64C11.094 109.768 7.504 103.498 8.056 96.882 8.609 90.266 13.19 84.679 19.57 82.84L211.51 24.64h.15c5.564-1.563 11.539-.004 15.63 4.078 4.091 4.083 5.662 10.054 4.11 15.622Z"),
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
        return _paperPlaneTilt!!
    }

private var _paperPlaneTilt: ImageVector? = null
