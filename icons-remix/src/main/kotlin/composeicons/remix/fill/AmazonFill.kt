package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AmazonFill: ImageVector
    get() {
        if (_amazonFill != null) return _amazonFill!!
        _amazonFill = remixIcon(
            name = "AmazonFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.997 18.229c0 .728-.405 2.128-1.315 2.897-.182 .14-.364 .061-.284-.143 .265-.648 .872-2.147 .587-2.492-.201-.262-1.031-.243-1.739-.182-.323 .041-.607 .061-.827 .104-.204 .017-.246-.162-.042-.303 .262-.185 .545-.325 .871-.428 1.15-.344 2.479-.137 2.669 .083 .037 .042 .08 .16 .08 .464ZM20.075 19.524c-.262 .202-.545 .386-.829 .549-2.123 1.276-4.871 1.943-7.259 1.943-3.842 0-7.28-1.417-9.887-3.787-.224-.182-.039-.447 .223-.303 2.809 1.64 6.288 2.632 9.888 2.632 2.266 0 4.708-.424 7.035-1.337 .162-.061 .344-.143 .504-.201 .367-.166 .689 .242 .325 .504ZM13.905 8.495c.001-1.042 .042-1.655-.303-2.181-.306-.433-.833-.692-1.568-.652-.798 .044-1.655 .567-1.874 1.526-.042 .219-.171 .435-.436 .483L7.288 7.362C7.114 7.32 6.849 7.188 6.936 6.84 7.459 4.088 9.811 3.129 12.033 3h.523c1.22 0 2.787 .349 3.791 1.264 1.217 1.136 1.087 2.662 1.087 4.32v3.926c0 1.178 .477 1.7 .958 2.313 .13 .219 .174 .477-.045 .655-.481 .435-1.394 1.219-1.917 1.654-.174 .133-.488 .147-.609 .045-.77-.646-.958-1.003-1.436-1.658-.829 .871-1.526 1.352-2.356 1.613-.523 .133-1.087 .216-1.784 .216-2.09 0-3.746-1.303-3.746-3.881 0-2.048 1.09-3.442 2.7-4.101 1.61-.659 3.95-.87 4.704-.874ZM13.428 13.686c.519-.871 .477-1.586 .477-3.185-.652 0-1.307 .045-1.872 .178-1.045 .303-1.874 .961-1.874 2.355 0 1.09 .567 1.832 1.526 1.832 .132 0 .248-.017 .348-.045 .669-.187 1.088-.523 1.394-1.136Z"),
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
        return _amazonFill!!
    }

private var _amazonFill: ImageVector? = null
