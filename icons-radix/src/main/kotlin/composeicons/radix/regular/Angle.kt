package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Angle: ImageVector
    get() {
        if (_angle != null) return _angle!!
        _angle = radixIcon(
            name = "Angle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.261 2.233c.171-.158 .434-.18 .631-.039 .196 .141 .26 .397 .165 .609l-.051 .088L2.474 12h11.026l.101 .01c.228 .047 .399 .249 .399 .49-0 .242-.172 .443-.399 .489l-.101 .011h-12c-.187 0-.359-.106-.444-.273-.086-.167-.071-.367 .038-.519L8.193 2.309l.067-.076ZM13.4 10c.276 0 .5 .224 .5 .5-0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5ZM12.6 8c.276 0 .5 .224 .5 .5-0 .276-.224 .5-.5 .5-.276-0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5ZM11.6 6c.276 0 .5 .224 .5 .5-0 .276-.224 .5-.5 .5-.276-0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5ZM10.4 4c.276 0 .5 .224 .5 .5-0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5Z"),
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
        return _angle!!
    }

private var _angle: ImageVector? = null
