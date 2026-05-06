package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PaperPlaneTilt: ImageVector
    get() {
        if (_paperPlaneTilt != null) return _paperPlaneTilt!!
        _paperPlaneTilt = phosphorThinIcon(
            name = "PaperPlaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224.47 31.52c-3.086-3.102-7.628-4.255-11.82-3L20.74 86.67c-4.809 1.356-8.274 5.551-8.699 10.529-.425 4.979 2.28 9.699 6.789 11.851L105 151l41.92 86.15c1.962 4.198 6.186 6.872 10.82 6.85 .34 0 .69 0 1 0 4.969-.388 9.169-3.833 10.52-8.63L227.47 43.37v-.08c1.24-4.177 .088-8.696-3-11.77ZM219.85 41.06 161.62 233.06c-.455 1.611-1.866 2.768-3.535 2.899-1.669 .132-3.243-.79-3.945-2.309L112.84 148.79l50-50c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0l-50 50L22.28 101.82c-1.551-.693-2.47-2.314-2.27-4 .122-1.707 1.336-3.139 3-3.54L214.9 36.16c.357-.105 .728-.159 1.1-.16 1.05 .015 2.052 .442 2.79 1.19 1.035 .999 1.441 2.483 1.06 3.87Z"),
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
