package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.UpworkFill: ImageVector
    get() {
        if (_upworkFill != null) return _upworkFill!!
        _upworkFill = remixIcon(
            name = "UpworkFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM15.883 8.283c-.645 .03-1.268 .258-1.783 .654-.589 .453-1 1.1-1.161 1.825-.349-.731-.613-1.501-.787-2.293h-2.599v3.223c0 1.171-.53 2.039-1.57 2.039-1.04 0-1.632-.864-1.632-2.039v-3.223h-1.493v3.223c-.034 .893 .275 1.766 .861 2.439 .286 .312 .636 .558 1.025 .724 .39 .165 .811 .245 1.234 .234 1.799-0 3.058-1.382 3.059-3.36v-2.179c.306 1.172 .811 2.283 1.493 3.284l-.8 4.56h1.517l.526-3.23c.174 .15 .36 .287 .555 .408 .507 .32 1.089 .5 1.688 .521h.139c.446 .005 .888-.08 1.3-.251 .412-.171 .785-.423 1.097-.741 .312-.318 .555-.697 .717-1.112 .162-.415 .238-.859 .224-1.305 .01-.444-.069-.885-.233-1.298-.163-.413-.408-.789-.72-1.105-.312-.316-.684-.566-1.094-.735-.41-.17-.851-.255-1.295-.251l-.269-.012ZM16.16 9.645c1.052 0 1.852 .816 1.852 2.04-0 1.224-.817 2.039-1.852 2.039l-.167 .011c-.37-.043-.727-.163-1.049-.353-.368-.217-.679-.52-.905-.882 .273-2.178 1.069-2.855 2.121-2.855Z"),
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
        return _upworkFill!!
    }

private var _upworkFill: ImageVector? = null
