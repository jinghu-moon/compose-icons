package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.WhatsappLine: ImageVector
    get() {
        if (_whatsappLine != null) return _whatsappLine!!
        _whatsappLine = remixIcon(
            name = "WhatsappLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.254 18.494l.725 .423C9.189 19.623 10.565 20 12.001 20c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8C7.583 4 4.001 7.582 4.001 12c0 1.436 .377 2.813 1.084 4.024l.422 .724-.653 2.402 2.4-.655ZM2.005 22 3.357 17.031C2.495 15.554 2.001 13.835 2.001 12 2.001 6.477 6.478 2 12.001 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C10.167 22 8.449 21.506 6.971 20.645L2.005 22ZM8.392 7.308c.134-.009 .268-.011 .402-.004 .054 .004 .108 .01 .162 .016 .159 .018 .334 .115 .393 .249 .298 .676 .588 1.357 .868 2.041 .062 .151 .025 .347-.093 .536-.06 .097-.154 .233-.263 .373-.113 .145-.356 .411-.356 .411 0 0-.099 .118-.061 .265 .014 .056 .061 .137 .103 .205 .023 .038 .045 .071 .059 .095 .256 .427 .6 .86 1.02 1.268 .12 .117 .237 .236 .363 .346 .468 .413 .998 .75 1.57 1l.005 .002c.084 .036 .128 .056 .252 .109 .062 .026 .126 .049 .192 .066 .024 .006 .048 .01 .072 .011 .162 .01 .255-.094 .295-.142 .724-.877 .79-.934 .795-.933v.002c.095-.1 .245-.135 .378-.127 .061 .004 .122 .015 .177 .041 .532 .243 1.401 .621 1.401 .621l.582 .261c.097 .047 .186 .158 .191 .265 .003 .067 .01 .175-.014 .372-.031 .259-.11 .57-.188 .733-.055 .115-.126 .216-.209 .302-.112 .117-.196 .187-.331 .288-.082 .061-.125 .09-.125 .09-.139 .088-.217 .131-.383 .219-.257 .137-.542 .216-.833 .231-.186 .01-.371 .023-.556 .013-.008-0-.568-.087-.568-.087C12.269 16.074 10.954 15.374 9.85 14.402c-.226-.199-.435-.414-.648-.626C8.313 12.891 7.64 11.936 7.232 11.034c-.201-.445-.329-.922-.331-1.413C6.897 9.014 7.096 8.423 7.466 7.942c.073-.095 .142-.193 .261-.306 .126-.119 .207-.183 .293-.228 .116-.059 .242-.091 .372-.1Z"),
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
        return _whatsappLine!!
    }

private var _whatsappLine: ImageVector? = null
